package section02_standard_functional_interface;


import java.util.function.UnaryOperator;

public class StudyOperator {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = String::toUpperCase;
        System.out.println(unaryOperator.apply("Hello"));
    }
}
