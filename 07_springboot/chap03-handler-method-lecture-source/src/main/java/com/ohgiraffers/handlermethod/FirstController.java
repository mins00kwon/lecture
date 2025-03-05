package com.ohgiraffers.handlermethod;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// first로 시작하는 모든 요청은 여기로 오게 하고 싶음
@Controller
@RequestMapping("/first")
public class FirstController {

    /* 설명: 핸들러 메소드에서 반환형이 없을 경우 요청결로를 반환한다(view의 경로 및 이름) */

    /* 설명: request는 사용자의 입력값(parameter)를 담는 용도로 쓰고, Model은 백엔드에서 동적 페이지를 만들 때 사용*/
    @GetMapping("/regist")      /* 필기: 이렇게 여러 단계로 나누어서 주소값을 작성할 수 있구낭! */
//    public String regist(){
//        return "first/regist";      /* 필기: html 파일도 first 폴더 안에 regist.html 을 만들긩 */
//    }
    public void regist() {}         /* 필기: 아무것도 반환하지 않으면 요청 자체를 반환함 */

    @PostMapping("regist")      // / 생략 가능함
    public String registMenu(HttpServletRequest request, Model model) {
        String name=request.getParameter("name");
        System.out.println("name = " + name);

        int price=Integer.parseInt(request.getParameter("price"));
        int categoryCode=Integer.parseInt(request.getParameter("categoryCode"));

        /* 설명: 비즈니스 로직 이후 DB에 insert를 성공하고 돌아왔다는 가정*/
        String message = name + "을(를) 신규 메뉴 목록인 " + categoryCode + "번 카테고리에 " + price + "원으로 등록하였습니다.";
        model.addAttribute("message", message);

        return "first/messagePrinter";  // 여기도 / 생략 가능함
    }

    @GetMapping("modify")
    public void modify() {}

    /* 필기: 얘도 결국 요청을 받아서 특정 페이지를 리턴하는 것
    *   근데 페이지 완성을 위해 필요한 재료를 함께 전달해야겠지? */
    /* 필기: Model
    *   Model은 사용자가 날린 요청에서 필요한 것을 꺼낸것을 '조립'해서 보내는 역할
    *   Model은 조립을 하는 역할이니까 요청을 받아서 필요한 것을 꺼내는 역할을 하는 애도 있어야겠지?*/

    /* 필기: 요청을 받아오는 방법
    *   1.  HttpServletRequest request 로 받아온 후 코드 내에서
    *       int price=Integer.parseInt(request.getParameter("price")) 등으로 값을 추출
    *   2.  @RequestParam(name = "name") String modifyName 를 활용해서
    *       받아오는것과 동시에 변수에 담기
    *       - 장점: parseInt등을 하지 않아서 코드 내부가 깔끔해짐.
    *       - 심화: @RequestParam(name="modifyPrice") 생략 가능
    *              (키값과 변수명이 같은 경우) (자료형 변수명) 으로 축약 가능
     * */

    /* 설명:
    *   requeset의 parameter로 넘어오는 값들의 key값과 일치하는 변수명을 작성하고
    *   @RequestParam 어노테이션을 적용하면 알아서 값을 꺼내고 해당 매개변수의 자료형에 맞게 변환까지 해 준다
    *   (가능한 경우만)(형변환 실패하면 에러 발생)
    **/

    /* 설명:
        1. defaultValue
    *   사용자의 입력 값이 없거나 request의 parameter 가 키 값과 일치하지 않는 매개변수 사용 시
    *   매개변수가 가질 기본 default값을 작성한다
        2. name
        reqeust parameter의 키 값과 다른 매개변수 명을 사용하고 싶으면 request parameter의 키 값을 작성한다.
    */

    @PostMapping("modify1")
    public String modify1(Model mode,
                          @RequestParam(name = "name", defaultValue ="XXX") String modifyName,
                            @RequestParam(name="modifyPrice",defaultValue = "0") int modifyPrice) {/* 설명: 넘어온 parameter의 키값과 핸들러 메소드의 매개변수의 이름이 같으면 생략 가능*/

        /* 설명: 넘어온 데이터들로 update를 하고 성공했다는 가정*/

        String message=modifyName+ " 메뉴의 가격을 " + modifyPrice+"원으로 변경하였습니다";
        mode.addAttribute("message", message);
        return "first/messagePrinter";
    }
}
