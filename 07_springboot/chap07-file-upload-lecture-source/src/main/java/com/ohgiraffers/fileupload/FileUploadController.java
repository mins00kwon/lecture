package com.ohgiraffers.fileupload;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FileUploadController {

    /* 설명: multipart/form-data로 넘어오는 값은 MultipartFile로 받아내야 한다*/
    @PostMapping("single-file")
    public String singleFile(@RequestParam MultipartFile singleFile,
                             @RequestParam String singleFileDescription,
                             RedirectAttributes rttr) { /* 필기: 원래 리다이렉트 되면 리퀘스트 정보가 초기화 되는데 rttr에 담아서 보내면 리다이렉트 되어도 리퀘스트 헤더에 정보가 담겨있음 */
        System.out.println("singleFile = " + singleFile);
        System.out.println("singleFileDescription = " + singleFileDescription);

        /* 목차: 1. 저장될 파일의 경로 설정 후 파일 저장*/
        String filePath="/Users/mk/uploadFiles";

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
            rttr.addFlashAttribute("singleFileDescription", singleFileDescription);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return "redirect:/result";/* 필기: redirect는 GET 요청임 */
    }

    @GetMapping("result")
    public void result() {}
}
