package ch02_intermediate_operation.ch01_filter;

import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.iterate(1, i -> i + 1).limit(10);
        integerStream.filter(i->i%2==0).forEach(str->System.out.print(str+" "));
    }
}
