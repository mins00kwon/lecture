package com.ohgiraffers.restapi.section02.responseentity;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entity")
public class ResponseEntityTestController {
    /* 설명: Response Entity 란?
     *  HttpRequest를 응답하기 위해 httpEntity를 상속받아 HttpStatus, HttpHeadres, HttpBody를
     * 정의하여 사용하는 클래스이다.
     *  */

    private List<UserDTO> users;

    public ResponseEntityTestController() {
        this.users = new ArrayList<>();
        users.add(new UserDTO(1, "user01", "pass01", "홍길동", new java.util.Date()));
        users.add(new UserDTO(2, "user02", "pass02", "유관순", new java.util.Date()));
        users.add(new UserDTO(3, "user03", "pass03", "아순신", new java.util.Date()));
    }

    public ResponseEntityTestController(List<UserDTO> users) {
        this.users = users;
    }

    @GetMapping("/users")
    /* 설명: 1. ResponseEntity 생성자를 이용한 응답 */
    public ResponseEntity<ResponseMessage> findAllUsers() {
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(
                new MediaType("application", "json", Charset.forName("UTF-8"))
        );

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("users", users);
        ResponseMessage responseMessage = new ResponseMessage(200, "조회 성공!", responseMap);

        return new ResponseEntity<>(responseMessage, headers, HttpStatus.OK);
    }
}
