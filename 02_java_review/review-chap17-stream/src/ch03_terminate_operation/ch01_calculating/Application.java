package ch03_terminate_operation.ch01_calculating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.forEach(System.out::println);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        long a=Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .filter(e -> e % 2 == 0)
                .count();
        System.out.println(a);
    }
}
