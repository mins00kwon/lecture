package ch03_terminate_operation.ch02_reduce.two_parameter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int sum=list.stream()
                .reduce(10,(a,b)->a+b);
        System.out.println("sum = " + sum);
    }
}
