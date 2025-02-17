package ch01_make_stream.ch08_concat_stream;

import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("a", "b", "c");
        Stream<String> concatStream= Stream.concat(stream1, stream2);
        concatStream.forEach(str-> System.out.print(str+" "));
    }
}
