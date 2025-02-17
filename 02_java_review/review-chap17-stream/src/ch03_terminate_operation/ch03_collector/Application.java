package ch03_terminate_operation.ch03_collector;

import static java.util.stream.Collectors.joining;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        List<Integer> intArr = Stream.iterate(1, i -> i + 1).limit(10)
                .collect(Collectors.toList());
        System.out.println(intArr);
        String str = Stream.of("abc","cde","fgh")
                .collect(Collectors.joining());
        System.out.println(str);
    }
}
