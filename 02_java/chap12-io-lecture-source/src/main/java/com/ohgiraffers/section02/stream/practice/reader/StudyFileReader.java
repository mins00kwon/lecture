package com.ohgiraffers.section02.stream.practice.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudyFileReader {
    public static void main(String[] args) {
        basicFileReader();
    }

    public static void basicFileReader() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(
                    "/Users/mk/Desktop/Hanhwa-Bootcamp/lecture/02_java/chap12-io-lecture-source/src/main/java/com/ohgiraffers/section02/stream/practice/reader/testFileReader.txt");
            int readChar = 0;
            while ((readChar = fileReader.read()) != -1) {
                System.out.print((char) readChar);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
