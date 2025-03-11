package com.ohgiraffers.section01.xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("========= 마이바티스 동적 SQL =========");
            System.out.println("1. if 확인하기");
            System.out.println("2. choose(when, otherwises) 확인하기");
            System.out.println("3. foreach 확인하기");
            System.out.println("4. trim(where, get) 확인하기");
            System.out.println("9. 종료하기");
            System.out.print("메뉴를 선택하세요: ");
            int no= Integer.parseInt(br.readLine());
            switch (no){
                case 1:
                    break;
                    case 2:
                        break;
                        case 3:
                            break;
                            case 4:
                                break;
                                case 9:
                                    System.out.println("프로그램을 종료합니다.");
                                    return;
                                    default:
                                        System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }while(true);
    }
}
