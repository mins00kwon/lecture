package com.ohgiraffers.section01.intenum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// enum 안쓰면 불편한것에 대한 내용 개념을 배운건 아님
public class Application1 {
    public static void main(String[] args) throws IOException {
        /* 목표: 단순 정수 열거 패턴과 이의 단점을 이해할 수 있다
        *   = enum을 사용할지 않을 때 단점을 이해할 수 있다*/
        int subject1=Subjects.JAVA;
        int subject2=Subjects.HTML;

        /* 설명: 1. 둘 다 같은 상수이자 숫자일 뿐 구분할 수 없다(런타임 시점)*/
        if (subject1==subject2) {
            System.out.println("subject1 and subject2 are the same");
        }

        /* 설명: 2. 변수명에 쓰인 이름(문자열)을 출력하기 어렵다. (feat.switch)*/
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("과목 번호를 입력하세요(0~2): ");
        int fineNo= Integer.parseInt(br.readLine());

        /* 설명: 심지어 모든 필드를 문자열로 바꿀 수 없는 상황*/
        String subName="";
        switch (fineNo) {
            case Subjects.JAVA: subName="Java"; break;
            case Subjects.MARIADB: subName="MariaDB"; break;
            case Subjects.JDBC: subName="JDBC"; break;
        }
        System.out.println("선택한 과목명은 "+subName+"입니다");

        /* 설명: 3. 같은 클래스에 속한 상수들은 순회(반복자/반복문) 할 수 없다
        *   필드가 총 몇개이고 어떤 것들이 있는지 확인 불가능
        * */
        /* 설명: 4. 타입 안정성을 보장할 수 없다*/
    }
}
