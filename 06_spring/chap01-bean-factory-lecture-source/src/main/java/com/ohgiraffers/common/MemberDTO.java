package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/* 필기: Lombok: 코드를 대체해주는 어노테이션을 제공하는 라이브러리 */
@NoArgsConstructor  // 매개변수를 가지지 않는 Constructor
@AllArgsConstructor // 모든 매개변수를 가지는 Constructor
@Setter             // 여기 아래는 말 안해도 알겠지?
@Getter
@ToString
// @Data            // 어노테이션 싹 다 붙여줌. 근데 쓰잘데 없는 것도 들어가서 느려지겠쥬?
public class MemberDTO {
    private int sequence;
    private String id;
    private String pwd;
    private String name;
}
