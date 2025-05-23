package com.ohgiraffers.fileupload;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FileUploadController {
    /* 필기: 이게 chap01에서 배웠던 그 내용임                                                                                                                                                                                                                                                                                                                                                                                                                        */
    @Value("${filePath}")
    private String filePath;

    /* 설명: multipart/form-data로 넘어오는 값은 MultipartFile로 받아내야 한다*/
    @PostMapping("single-file")
    public String singleFile(@RequestParam MultipartFile singleFile,
                             @RequestParam String singleFileDescription,
                             RedirectAttributes rttr) { /* 필기: 원래 리다이렉트 되면 리퀘스트 정보가 초기화 되는데 rttr에 담아서 보내면 리다이렉트 되어도 리퀘스트 헤더에 정보가 담겨있음 */
        System.out.println("singleFile = " + singleFile);
        System.out.println("singleFileDescription = " + singleFileDescription);

        /* 목차: 1. 저장될 파일의 경로 설정 후 파일 저장*/
//        String filePath="/Users/mk/uploadFiles";

        /* 목차: 2. 파일의 이름 리네임*/
        /* 설명: 사용자가 넘긴 파일의 원본이름을 확인하고 rename 해보자
        *   자바의 UUID 클래스를 이용한 무작위 문자열 형태로 생성*/
        String originFileName=singleFile.getOriginalFilename();
        System.out.println("originFileName = " + originFileName);

        String ext=originFileName.substring(originFileName.lastIndexOf("."));
        System.out.println("ext = " + ext);

        String savedName= UUID.randomUUID().toString().replace("-", "")+ext;
        System.out.println("savedName = " + savedName);

        /* 목차: 3. DB로 보낼 데이터 만들기(Map<String, String>, List<Map<String, String>>*/
        /* 설명: 우리가 지정한 경로로 파일을 저장*/
        try {
            singleFile.transferTo(new File(filePath+"/img/single/"+savedName));

            /* 설명: DB로 보낼 데이터 Map으로 가공 처리*/
            Map<String, String> file=new HashMap<String, String>();
            file.put("originalFileName", originFileName);
            file.put("savedName", savedName);
            file.put("filePath","img/single");
            file.put("singleFileDescription", singleFileDescription);

            /* 설명: 이후 service 계층을 통해 DB에 사용자가 업로드한 파일의 내용을 저장하고 옴 */
//            fileUploadService.registFile(file);



            rttr.addFlashAttribute("message", originFileName+" 업로드 성공!");
            rttr.addFlashAttribute("img","/img/single/"+savedName);
            System.out.println("/img/single/"+savedName);
            rttr.addFlashAttribute("singleFileDescription", singleFileDescription);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return "redirect:/result";/* 필기: redirect는 GET 요청임 */
    }

    @GetMapping("result")
    public void result() {}

    @PostMapping("multi-file")
    public String multiFile(@RequestParam List<MultipartFile> multiFiles,
                            @RequestParam String multiFileDescription,
                            RedirectAttributes rttr) {

//        String filePath="/Users/mk/uploadFiles";

        /* 필기: DB로 보낼 파일 담을 리스트 */
        List<Map<String,String>> files=new ArrayList<>();
        /* 설명: 화면에서 각 파일마다 img 태그의 src 속성으로 적용하기 위한 문자열을 담은 컬렉션*/
        List<String> imgSrcs=new ArrayList<>();


        try {
            for (int i = 0; i < multiFiles.size(); i++) {
                /* 설명: 각 파일마다 리네임 */
                String originalFileName = multiFiles.get(i).getOriginalFilename();
                String ext = originalFileName.substring(originalFileName.lastIndexOf("."));
                String savedName = UUID.randomUUID().toString().replace("-", "") + ext;

                /* 설명: 파일 저장 경로에 저장*/
                multiFiles.get(i).transferTo(new File(filePath + "/img/multi/" + savedName));

                /* 설명: DB에 보낼 값 설정(Map<String, String>)*/
                Map<String, String> file = new HashMap<>();
                file.put("originalFileName", originalFileName);
                file.put("savedName", savedName);
                file.put("filePath", "img/multi");
                file.put("multiFileDescription", multiFileDescription);
                files.add(file);    // 크기를 지정해놓지 않았으니 가능
                imgSrcs.add("/img/multi/"+savedName);
            }//for 문 종료. try 문 내부
            /* 설명: 여기까지 성공했다면 파일 저장 및 DB inert까지 모두 완성되었으니 화면의 재료 작성 */
            rttr.addFlashAttribute("message", "다중 파일 업로드 성공!");
            rttr.addFlashAttribute("imgs", imgSrcs);
            rttr.addFlashAttribute("multiFileDescription", multiFileDescription);
        } catch (IOException e) {
            /* 설명: transferTo 파일을 경로에 저장하다가 예외가 발생하면 앞에 이미 성공해서 저장된 파일들을 찾아 지움*/
            for (int i = 0; i < files.size(); i++) {
                Map<String, String> file = files.get(i);
                new File(filePath+"/img/multi/"+file.get("savedName")).delete();
            }
            rttr.addFlashAttribute("message", "파일 업로드 실패");
        }
        return "redirect:/result";
    }
}
