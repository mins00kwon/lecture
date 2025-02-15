package ch01_make_stream.ch05_iterate_stream;

import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        Stream<Integer> stream= Stream.iterate(1,x->x*2).limit(10);
        stream.forEach(str->System.out.print(str+" "));
    }
}
