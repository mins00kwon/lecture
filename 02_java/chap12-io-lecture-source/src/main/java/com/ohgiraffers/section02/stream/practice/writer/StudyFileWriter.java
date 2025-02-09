package com.ohgiraffers.section02.stream.practice.writer;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class StudyFileWriter {
    public static void main(String[] args) {
        basicFileWriter("안녕하세요\n" +
                "한글 입력이 잘 되는지 확인중입니다\n"
                + "꼭 잘 되었으면 좋겠군요\n"
                + "Happy new year.");
    }

    static void basicFileWriter(String str) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(
                    "/Users/mk/Desktop/Hanhwa-Bootcamp/lecture/02_java/chap12-io-lecture-source/src/main/java/com/ohgiraffers/section02/stream/practice/writer/testFileWriter.txt");
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                fileWriter.write(chars[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
