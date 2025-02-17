package ch02_intermediate_operation.ch04_sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        List<Integer> integers = IntStream.of(55,10,27,8,74)
                .boxed()
                .sorted()
                .toList();
        System.out.println(integers);
    }
}
