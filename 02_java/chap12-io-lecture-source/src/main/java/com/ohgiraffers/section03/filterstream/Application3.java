package com.ohgiraffers.section03.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) throws IOException {
        /* 목표: 데이터 타입 입출력 보조 스트림을 이해하고 활용할 수 있다*/
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(
                    "src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"
            ));

            // 회원 단위 통신은 아직 못하는거
            // 이렇게 보내면 우리가 알아보지 못하는 형태로 저장됨
            // 다시 데이터 단위로 읽어와서 봐야지 알아볼 수 있음
            dos.writeUTF("홍길동");
            dos.writeInt(20);
            dos.writeChar('A');

            dos.writeUTF("유관순");
            dos.writeInt(16);
            dos.writeChar('B');

            dos.writeUTF("강경진");
            dos.writeInt(38);
            dos.writeChar('O');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream(
                    "src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"
            ));
            while (true) {
                /* 설명: 출력했던 데이터 단위를 지켜서 이볅해야 온전히 데이터를 읽어들일 수 있다*/
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readChar());
            }
        }
        // 질문: 이게 정확히 뭐라고??
        // dis.read~가 읽어와야 하는 범위가 정해져 있는데 해당 범위가 채워지지 않았는데 다 가져왔다고??
        catch (EOFException e) {
            /* 설명: data 단위 입출력은 EOF를 EOFException 처리를 통해 확인하고 처리할 수 있다*/
            System.out.println("데이터 파일 읽기 완료");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
