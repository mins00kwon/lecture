package com.ohgiraffers.section02.stream.practice.input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudyFileInputStream {
    public static void main(String[] args) throws IOException {
        /* 목표: FileInputStream 을 이해할 수 있다*/
        basicFileInputStream();
    }

    /* 설명: 경로를 찾지 못하면 예외를 발생시키는 함수*/
    public static void basicFileInputStream() throws IOException {
        FileInputStream fis = new FileInputStream(
                "/Users/mk/Desktop/Hanhwa-Bootcamp/lecture/02_java/chap12-io-lecture-source/src/main/java/com/ohgiraffers/section02/stream/practice/input_stream/testFileInputStream.txt");
        int fileInput = 0;
        while ((fileInput = fis.read()) != -1) {
            System.out.print((char) fileInput);
        }
    }

    public static void basicFileInputStreamWithException() throws RuntimeException, FileNotFoundException, IOException {
        FileInputStream fis = null;
        // 경로를 지정하고, 파일을 읽어오는 부분
        try {
            fis = new FileInputStream(
                    "/Users/mk/Desktop/Hanhwa-Bootcamp/lecture/02_java/chap12-io-lecture-source/src/main/java/com/ohgiraffers/section02/stream/practice/input_stream/testFileInputStream.txt");
            int fileInput = 0;
            while ((fileInput = fis.read()) != -1) {
                System.out.print((char) fileInput);
            }
        }
        // 경로 지정 실패 예외 처리
        catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }
        // 파일을 읽어오다 발생하는 예외 처리
        catch (IOException e) {
            throw new IOException(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
