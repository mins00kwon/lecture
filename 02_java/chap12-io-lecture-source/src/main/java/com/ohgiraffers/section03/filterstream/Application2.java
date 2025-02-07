package com.ohgiraffers.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application2 {
    public static void main(String[] args) {
        /* 목표: 표준입출력(콘솔과의 입출력)을 이해하고 활용할 수 있다*/
        //                    보조스트림(2)           보조스트림(1)        기반스트림
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //

        //사실 얘동 스트림
        System.out.print("Enter String: ");
        try {
            String input = br.readLine();
            System.out.println("input = " + input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedWriter bw = null;
        OutputStreamWriter osw = null;
        osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);

        try {
            bw.write("println이 좋은거였구나...");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
