package com.ohgiraffers.section02.stream.practice.output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudyFileOutputStream {
    public static void main(String[] args) {
        /* 설명:
         *   FileOutputStream은 FileInputStream과 달리 지정한 경로의 파일이 존재하지 않으면 파일을 생성함
         *   경로만 지정하면 덮어쓰기, 두 번째 전달인자에 true 를 쓰면 이어 쓰기
         * */

        basicFileOutputStream("Hello? Somebody there?");

    }

    public static void basicFileOutputStream(String str) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(
                    "/Users/mk/Desktop/Hanhwa-Bootcamp/lecture/02_java/chap12-io-lecture-source/src/main/java/com/ohgiraffers/section02/stream/practice/output_stream/testFileOutputSteram.txt",
                    true);
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                fos.write(chars[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
