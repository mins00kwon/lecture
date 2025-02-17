package ch01_make_stream.ch07_string_stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        Stream<String> stringStream =
                Pattern.compile(",")
                        .splitAsStream("Hello,Stream,World");
        stringStream.forEach(System.out::println);

    }
}
