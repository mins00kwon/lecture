package section02_standard_functional_interface;

import java.util.function.Function;

public class StudyFunction {
    public static void main(String[] args) {
        Function<String, String> f = s -> s.toUpperCase();
        System.out.println(f.apply("Hello"));

        Function<String, Integer> f2=s->s.length();
        System.out.println(f2.apply("Hello"));
    }
}
