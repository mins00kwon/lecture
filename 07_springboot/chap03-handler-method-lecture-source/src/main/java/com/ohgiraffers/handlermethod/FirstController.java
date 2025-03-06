package com.ohgiraffers.handlermethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

// first로 시작하는 모든 요청은 여기로 오게 하고 싶음
@Controller
@RequestMapping("/first")

/* 설명: 이 Controller 클래스의 핸들러 메소드에서 Model에 "id"라는 키 값으로 담기면
    해당 key-value 쌍을 HttpSession에 추가하는 어노테이션*/
/* 설명: HttpSession에서 제공하는 invalidate()가 아닌
    SessionStatus가 제공하는 setComplete()를 통해 만료시킬 수 있다*/
@SessionAttributes("id")
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
    public String modify1(Model model,
                          @RequestParam(name = "name", defaultValue ="XXX") String modifyName,
                            @RequestParam(name="modifyPrice",defaultValue = "0") int modifyPrice) {/* 설명: 넘어온 parameter의 키값과 핸들러 메소드의 매개변수의 이름이 같으면 생략 가능*/

        /* 설명: 넘어온 데이터들로 update를 하고 성공했다는 가정*/

        String message=modifyName+ " 메뉴의 가격을 " + modifyPrice+"원으로 변경하였습니다";
        model.addAttribute("message", message);
        return "first/messagePrinter";
    }
    /* 필기: 세 번째 방법: 파라미터 전체를 map으로 받기 */
    @PostMapping("modify2")
    public String modify2(Model model,
                          @RequestParam Map<String,String> parameterMap) {
        String modifyName=parameterMap.get("name");
        int modifyPrice=Integer.parseInt(parameterMap.get("modifyPrice"));
        String message=modifyName+ " 메뉴의 가격을 " + modifyPrice+"원으로 변경하였습니다";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    @GetMapping("search")
    public void searchMenu(){}

    /* 설명:
    *   핸들러 메소드에 우리가 작성한 클래스 (Bean 아님) 를 매개변수로 작성하면 스프링이 객체를 만들어 주고(기본 생성자로)
    *   setter로 값도 주입해 준다. 이러한 클래스의 클래스의 객체를 '커맨드 객체'라고 부른다.
    *   따라서 기본 생성자와 세터가 반드시 필요하다
    * */

    /* 필기: @ModelAttribute
    *   위 어노테이션을 달아야 포워딩 하는 페이지로 객체 정보가 전달된다 */

    /* 설명: @ModelAttribute
    *   위 어노테이션을 활용하면 커맨드 객체를 모델에 attribute로 담아주며, 이후 view의 재료로 사용할 수 있다
    *   (키 값 작성 유무에 따라 화면에서 활용하는 방법이 다르다)*/
    @PostMapping("search")
    public String searchMenu(MenuDTO menu){
        System.out.println("menu = " + menu);
        return "first/searchResult";
    }

    @GetMapping("login")
    public void login(){}

    @PostMapping("login")
    public String sessionTest1(String id, String pwd, HttpSession session) {
        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);

        /* 설명: 로그인 성공을 가정( 회원 조회 이후 )
        *       HttpSession에 로그인 성공한 회원 정보 저장*/
        session.setAttribute("id", id);
        session.setAttribute("pwd", pwd);

        return "first/loginResult";
    }

    /* 설명: Model에 담은 값 중에 일부를 HttpSession에 자동으로 담도록 어노테이션 활용*/
    /* 필기: Model에도 담고 Session에도 담고 */
    @PostMapping("login2")
    public String login2(Model model, String id) {
        model.addAttribute("id", id);

        return "first/loginResult";
    }
    @GetMapping("logout1")
    public String logout(HttpSession session) {
        session.invalidate();
        return "first/loginResult";
    }
    @GetMapping("logout2")
    public String logout2(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "first/loginResult";
    }

    @GetMapping("body")
    public void body(){}

    @PostMapping("body")
    public void body(@RequestBody String body,
                     @RequestHeader("content-type") String contentType,
                     @CookieValue(value = "JSESSIONID") String sessionId) {
        System.out.println("body = " + body);
        System.out.println("contentType = " + contentType);
        System.out.println("sessionId = " + sessionId);
    }
}
