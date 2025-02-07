package com.ohgiraffers.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        /* 목표: BufferedWirter와 BufferedReader에 대해 이해하고 사용할 수 있다*/
        /* 설명:
         *   내부적으로 버퍼(Buffer)를 활용해서 입출력 성능을 향상시킨다
         *   추가적인 메소드가 제공된다
         * */

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                    new FileWriter(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"
                    )
            );
            // bw 객체로 쓰는 것
            bw.write("Hello World\n");
            bw.write("하늘에서\n");
            bw.write("눈이\n");
            bw.write("펑펑 내리네요.\n");

            /* 설명: 내부적으로 버퍼가 다 차지 않으면 출력으로 내보내 지지 않는데
                flush()를 호출하면 버퍼가 비워진다
                == 버퍼에 있는게 출력된다.
            */
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
            }
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(
                    "src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"
            ));

            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println("str = " + str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
