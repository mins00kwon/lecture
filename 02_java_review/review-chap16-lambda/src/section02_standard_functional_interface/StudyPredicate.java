package section02_standard_functional_interface;

import java.util.function.Predicate;

public class StudyPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length()%2 == 0;
        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("ab"));
    }
}
