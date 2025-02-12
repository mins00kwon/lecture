package review_test_app.repository;

import com.ohgiraffers.section04.review_test_app.aggregate.AccountStatus;
import com.ohgiraffers.section04.review_test_app.aggregate.BloodType;
import com.ohgiraffers.section04.review_test_app.aggregate.Member;
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

// DB와 통신하는 클래스
public class MemberRepository {
    // 데이터가 담길 리스트
    private final ArrayList<Member> memberList = new ArrayList<>();
    // 파일의 경로
    private final File file = new File(
            "src/main/java/com/ohgiraffers/section04/review_test_app/db/memberDB.dat");

    // 생성자. 파일을 열어서 배열에 데이터를 담거나
    public MemberRepository() {
        if (!file.exists()) {
            ArrayList<Member> defaultMembers = new ArrayList<>();
            defaultMembers.add(
                    new Member(1, "user01", "pass01", 20, new String[]{"발레", "수영"}, BloodType.A, AccountStatus.ACTIVE));
            defaultMembers.add(new Member(2, "user02", "pass02", 10, new String[]{"게임", "영화시청"}, BloodType.B,
                    AccountStatus.ACTIVE));
            defaultMembers.add(new Member(3, "user03", "pass03", 30, new String[]{"러닝", "헬스"}, BloodType.AB,
                    AccountStatus.ACTIVE));
            saveMembers(defaultMembers);
        }
        loadMembers();
    }

    // 파일에서 회원 객체들을 읽어와서 memberList 컬렉션에 저장하는 함수
    public void loadMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)))) {
            while (true) {
                memberList.add((Member) ois.readObject());
            }
        }
        // EOFException은 자료의 끝에 왔을 때 발생하는 Exception
        catch (EOFException e) {
            System.out.println("회원 정보를 모두 읽어왔습니다");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // 멤버 배열을 입력받아 지정된 파일에 저장하는 함수
    public void saveMembers(ArrayList<Member> inputMembers) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)
                    )
            );
            for (Member member : inputMembers) {
                oos.writeObject(member);
            }
        } catch (Exception e) {

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

    // 현재 멤버 배열에 저장되어있는 멤버를 배열로 리턴하는 함수
    public ArrayList<Member> selectAllMembers() {
        return memberList;
    }

    // 회원번호를 바탕으로 배열에 저장되어있는 멤버중 회원번호가 일치하는 회원을 리턴하는 함수
    public Member selectMemberBy(int memNo) {
        for (Member member : memberList) {
            if (member.getMemNo() == memNo) {
                return member;
            }
        }
        return null;
    }
}
