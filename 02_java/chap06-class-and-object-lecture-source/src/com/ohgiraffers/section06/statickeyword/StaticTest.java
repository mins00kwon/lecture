package com.ohgiraffers.section06.statickeyword;

public class StaticTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticTest() {
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public void setNonStaticCount(int nonStaticCount) {
        this.nonStaticCount = nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public static void setStaticCount(int staticCount) {
        StaticTest.staticCount = staticCount;
    }

    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public static void increaseStaticCount() {
        StaticTest.staticCount++;
    }

}
