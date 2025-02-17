package ch03_terminate_operation.ch02_reduce.one_parameter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list=List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(
                list.stream()
                        .reduce((a, b) -> a + b)
        );
    }
}
