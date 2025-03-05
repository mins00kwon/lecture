package com.ohgiraffers.handlermethod;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// first로 시작하는 모든 요청은 여기로 오게 하고 싶음
@Controller
@RequestMapping("/first")
public class FirstController {

    /* 설명: 핸들러 메소드에서 반환형이 없을 경우 요청결로를 반환한다(view의 경로 및 이름) */


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
}
