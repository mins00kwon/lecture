<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Exception Handler</h1>
    <%--
        Exception 핸들링 해보기
        1. web.xml을 통해 에러 상태 코드 발생 시 어떤 서블릿으로 요청할지 url 경로 설정해보기
        2. 모든 에러에 대해 페이지를 동적으로 처리할 수 있게 페이지를 만들어 응답해보기
            = 어떤 에러가 발생해도 해당 에러에 대한 페이지를 만들어줌
            (request의 attritbute에 담긴 값을 활용할 예정)
                - request에는 두개의 주머니가 있음
                    - 사용자가 전송한 값
                    - 서버가 활용하려고 넣은 값
    --%>
    <ul>
        <li><a href="show404error">404에러 확인</a></li>
        <li><a href="show500error">500에러 확인</a></li>
    </ul>
</body>
</html>