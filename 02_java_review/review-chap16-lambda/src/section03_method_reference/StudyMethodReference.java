package section03_method_reference;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class StudyMethodReference {
    public static void main(String[] args) {

    }

    private static void referenceNonStaticErrorBeforeConstructed() {
        BiFunction<String, String, Boolean> biFunction = String::equals;
        System.out.println(biFunction.apply("hello", "world"));
    }

    private static void referenceNonStaticMethodError() {
//        Consumer<String> consumer = StudyMethodReference::exampleNonStaticMethod;
//        consumer.accept("Hello");
    }

    public void exampleNonStaticMethod(String str){
        System.out.println(this);
        System.out.println("ExampleNonStaticMethod: " + str);
    }
    public static void referenceStaticMethod() {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");
    }

    private static void referenceNonStaticMethod() {
        StudyMethodReference studyMethodReference = new StudyMethodReference();
        Consumer<String> consumer = studyMethodReference::exampleNonStaticMethod;
        consumer.accept("Hello");
    }
}
