package ch01_make_stream.ch06_builder_stream;

import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        Stream.Builder<String> builder=Stream.builder();
        builder.add("apple");
        builder.add("orange");
        builder.add("banana").add("grape");
        Stream<String> stream=builder.build();
        stream.forEach(str->System.out.print(str+" "));

        Stream<String> builderStreamPractice=Stream.<String>builder()
                .add("Hello")
                .add("World")
                .build();

        Stream<String> builderStream =
                Stream.<String>builder()
                        .add("hello")
                        .add("stream")
                        .add("world")
                        .build();
    }
}
