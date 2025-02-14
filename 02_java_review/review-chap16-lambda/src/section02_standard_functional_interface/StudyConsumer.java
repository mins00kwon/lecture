package section02_standard_functional_interface;

import java.util.function.Consumer;

public class StudyConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = string -> System.out.println(string);
        consumer.accept("Hello");
    }
}
