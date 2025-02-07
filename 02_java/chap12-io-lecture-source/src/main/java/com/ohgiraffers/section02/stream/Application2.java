package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: FileOutputStream을 이해할 수 있다*/

        /* 설명:
        *   FileOutputStream은 FileInputStream과 달리 해당 파일이 존재하지 않으면 파일을 생성해줌
        *   두 번째 전달인자로 ture를 전달하면 기존 데이터에 이어서 출력을 내보낼 수 있다(append)*/

        FileOutputStream fos = null;
        try {
            fos=new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutpuStream.txt");
            fos.write(97);
            fos.write('b');
            byte[] bArr=new byte[]{'a','b','c','d'};
            fos.write(bArr);
            for(byte b:bArr){
                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                if(fos!=null)fos.close();
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }
}
