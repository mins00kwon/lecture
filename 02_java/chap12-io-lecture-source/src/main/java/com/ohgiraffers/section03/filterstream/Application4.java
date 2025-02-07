package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application4 {
    public static void main(String[] args) {
        MemberDTO[] memArr = new MemberDTO[100];
        for (int i = 0; i < memArr.length; i++) {
            memArr[i] = new MemberDTO("user" + i, "pass" + i, "홍길동" + i, "hong" + i + "@gmail.com",
                    25 + i, '남');
        }

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt"
                    )
            );
            for (int i = 0; i < memArr.length; i++) {
                oos.writeObject(memArr[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        MemberDTO[] readMemArr = new MemberDTO[memArr.length];
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new FileInputStream(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt"
                    )
            );
            for (int i = 0; i < memArr.length; i++) {
                // readObject는 Object 객체를 반환하므로 (MemeberDTO)로 다운캐스팅 해줘야 함. ㅑ
                readMemArr[i] = (MemberDTO) ois.readObject();
                System.out.println(readMemArr[i].toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
