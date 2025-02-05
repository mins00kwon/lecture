package com.ohgiraffers.section02.string;

public class Application1 {
    public static void main(String[] args) {

        /* 목표: String 클래스의 자주 사용하는 메소드에 대해 숙지하고 으용할 수 있다*/
        /* 목차: charAt() */
        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println("str1.charAt("+i+") = " + str1.charAt(i));
        }

        /* 목차: 2. compareTo() */
        String str2 = "java";
        String str3 = "jAva";
        String str4 = "JAVA";
        String str5 = "mariaDB";
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        System.out.println(str4.compareTo(str2));
        System.out.println(str2.compareTo(str5));
        System.out.println(str5.compareTo(str2));
        // 일치하지 않는 첫 글자 기준으로 연산
        //글자수가 다르면 -1 or 1 리턴
        
        /* 목차: 3. concat() */
        System.out.println("str2.concat(str4) = " + str2.concat(str4));
        
        /* 목차: 4. indexOf() */
        String indexOf="java mariaDB";
        System.out.println("indexOf.indexOf('a') = " + indexOf.indexOf('a'));
        System.out.println("indexOf.indexOf(\"av\") = " + indexOf.indexOf("av")); // 오버로딩

        /* 목차: 5. trim() */
        String trimStr = "       java       ";
        System.out.println("trimstr:  #"+trimStr+"#");
        System.out.println("trim():  #"+trimStr.trim()+"#");

        /* 목차: 6. toLowerCase() / toUpperCase() */
        String caseStr = "javamariaDB";
        System.out.println("toLowerCase: "+caseStr.toLowerCase());
        System.out.println("toUpperCase: "+caseStr.toUpperCase());

        /* 목차: 7. subString() */
        String javamariaDB = "javaMariaDB";
        System.out.println("javamariaDB = " + javamariaDB.substring(3,6));
        System.out.println("javamariaDB = " + javamariaDB.substring(3));
        System.out.println("javamariaDB = " + javamariaDB);

        /* 목차: 8. replace() */
        System.out.println("replace(): "+javamariaDB.replace("java","python"));
        System.out.println("javamariaDB = " + javamariaDB);

        /* 목차: length() */
        System.out.println("javamariaDB = " + javamariaDB.length());
        System.out.println("\"\".length() = " + "".length());

        /* 목차: isEmpty() */
        System.out.println("\"\".isEmpty() = " + "".isEmpty());
        System.out.println("abc.isEmpty() = " + "abc".isEmpty());
        String a="abc";
        String b=new String("abc");
        System.out.println("a.equals(b) = " + a.equals(b));
    }
}
