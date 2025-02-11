package com.ohgiraffers.section01.list.practiceSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A"); list.add("D"); list.add("C"); list.add("B");
        Collections.sort(list);
        System.out.println(list);
    }
}
