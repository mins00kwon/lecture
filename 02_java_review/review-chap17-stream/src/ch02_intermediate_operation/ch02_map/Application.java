package ch02_intermediate_operation.ch02_map;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        IntStream.iterate(1, i -> i + 1).limit(5)
                        .map(i->i*5)
                                .forEach(str->System.out.print(str+" "));
        IntStream.iterate(1, i -> i + 1)
                .limit(5)
                .mapToObj(i -> switch (i) {
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    case 4 -> "Four";
                    case 5 -> "Five";
                    default -> "Unknown";
                })
                .forEach(str-> System.out.print(str+" "));
    }
}
