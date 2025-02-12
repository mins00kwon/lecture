package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.AccountStatus;
import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.stream.MyObjectOutput;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/* 설명. 데이터베이스 개념(Member 관련 파일)과 입출력(CRUD)을 위해 만들어지며
    성공데이터 또는 성공/실패 여부를 반환(java의 컬렉션 개념으로 데이터를 관리하기도 한다.) */
public class MemberRepository {

    /* 설명. 초기에 Member 파일이 없다면 파일을 만들어 더미데이터(dummy data)를 쌓는다. */
    private final ArrayList<Member> memberList = new ArrayList<>();
    private final File file =
            new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

    /* 설명. 프로그램 구동시 MemberRepository 생성자가 호출되며 초기에 실행할 내용들 */
    public MemberRepository() {

        // 파일이 존재하지 않으면 배열에 더미데이터를 담은 후 더미데이터가 담긴 파일을 생성(저장)
        if (!file.exists()) {
            ArrayList<Member> defaultMembers = new ArrayList<>();
            defaultMembers.add(new Member(1, "user01", "pass01", 20,
                    new String[]{"발레", "수영"}, BloodType.A, AccountStatus.ACTIVE));
            defaultMembers.add(new Member(2, "user02", "pass02", 10,
                    new String[]{"게임", "영화시청"}, BloodType.B, AccountStatus.ACTIVE));
            defaultMembers.add(new Member(3, "user03", "pass03", 30,
                    new String[]{"음악감상", "독서", "명상"}, BloodType.AB, AccountStatus.ACTIVE));

            saveMembers(defaultMembers);
        }
        loadMembers();
    }

    /* 설명. 파일로부터 회원 객체들을 읽어와서 memberList 컬렉션에 저장 */
    private void loadMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)
                )
        )) {
            while (true) {
                memberList.add((Member) ois.readObject());
            }

        } catch (EOFException e) {
            System.out.println("회원 정보 다 읽어옴");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* 설명. ArrayList<Member>를 받으면 파일로 출력하는 메소드(feat. 덮어씌우는 기능) */
    private void saveMembers(ArrayList<Member> inputMembers) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)));

            for (Member member : inputMembers) {
                oos.writeObject(member);
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
    }

    public ArrayList<Member> selectAllMembers() {
        return memberList;
    }

    public Member selectMemberBy(int memNo) {
        Member returnMember = null;

        for (Member member : memberList) {
            if (member.getMemNo() == memNo) {
                returnMember = member;
            }
        }

        return returnMember;
    }

    public int selectLastMemberNo() {
        Member lastMember = memberList.get(memberList.size() - 1);
        return lastMember.getMemNo();
    }

    public int insertMember(Member member) {

        /* 설명. 헤더가 추가되지 않는 ObjectOutputStream 클래스 정의(MyObjectOutputStream) */
        MyObjectOutput moo = null;
        int result = 0;

        try {
            moo = new MyObjectOutput(
                    new BufferedOutputStream(
                            new FileOutputStream(file, true)
                    )
            );
            /* 설명: 파일로 신규회원 추가하기*/
            moo.writeObject(member);

            /* 설명: 컬렉션에도 신규회원 추가하기*/
            // 싱크를 맞췄다고 이해하면 될 듯
            /* 설명: MyObjectOutputStream으로 이어붙인 정보는
             *   다시 입력 받아도 이전 파일로 인식하기 때문에
             *   프로그램을 꼈다 켜지 않는 인상 재인식 되지 않음.*/
            memberList.add(member);
            // insert가 성공한 경우 1을 리턴함
            result = 1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (moo != null) {
                    moo.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return result;
    }

    /* 설명: 수정된 사본이 넘어오면 컬렉션에 담긴 동일한 회원을 찾아서 컬렉션 update
     *   + 컬렉션의 회원 정보로 파일을 덮어씌움*/
    public int updateMember(Member reformedMember) {
        int result = 0;

        // 컬렉션에 담긴 동일한 회원을 찾아서
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getMemNo() == reformedMember.getMemNo()) {
                // 컬렉션 update
                memberList.set(i, reformedMember);
                // 컬렉션의 회원 정보로 파일을 덮어씌움
                saveMembers(memberList);
                result = 1;
            }
        }
        return result;
    }

    public int hardDeleteMember(int removeMemNo) {
        int result = 0;
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getMemNo() == removeMemNo) {
                memberList.remove(i);
                saveMembers(memberList);
                return 1;
            }
        }
        return result;
    }

    public int softDeleteMember(int removeMemNo) {
        int result = 0;
        for (Member member : memberList) {
            if (member.getMemNo() == removeMemNo) {
                member.setAccountStatus(AccountStatus.DEACTIVATED);
                result = 1;
                saveMembers(memberList);
            }
        }
        return result;
    }
}
