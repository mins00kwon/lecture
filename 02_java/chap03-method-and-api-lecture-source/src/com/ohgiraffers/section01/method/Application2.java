package com.ohgiraffers.section01.method;
public class Application2 {
    public static void main(String[] args) {
        /* 목표: static 을 쓰지 않은 함수를 호출하는 방법을 안다*/
        /* 설명: non-static 메소드인 경우 메소드를 new 연산자로 인지시켜 호출할 수 있다*/
        System.out.println("main() 시작됨...");
        Application2 app = new Application2();              // 풀어 말하자면 클래스를 밝히고 이름을 지정함
                                                            // 원래 해석은 객체 생성이었남
        app.methodA(app);                                   // 여기서 쓴 . 을 접근 연산자라고 한다
        System.out.println("main() 종료됨...");
    }

    public void methodA(Application2 app) {                 // 호출된 함수에서도 쓰려면 생성한 객체도 당연히 전달해야 함
        System.out.println("methodA() 호출됨...");
        app.methodB();
        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");
    }
}
