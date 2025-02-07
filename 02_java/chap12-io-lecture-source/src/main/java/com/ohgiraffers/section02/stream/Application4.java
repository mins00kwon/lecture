package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /* 목표: FileWriter에 대해 이해할 수 있다*/
        FileWriter fr = null;
        try {
            fr=new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");
            fr.write("한글");
            fr.write("짱\n");
            fr.write("세종대왕 만만세");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                if (fr!=null)fr.close();
            }catch(IOException e){throw new RuntimeException(e);}
        }
    }
}
