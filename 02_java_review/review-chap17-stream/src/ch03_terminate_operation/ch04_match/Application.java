package ch03_terminate_operation.ch04_match;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("one", "two", "three", "four", "five");
        Boolean anyMatch= stringList.stream().anyMatch(s -> s.contains("o"));
        Boolean allMatch= stringList.stream().allMatch(s -> s.contains("o"));
        Boolean noneMatch= stringList.stream().noneMatch(s -> s.contains("o"));
        System.out.println("anyMatch = " + anyMatch);
        System.out.println("allMatch = " + allMatch);
        System.out.println("noneMatch = " + noneMatch);
    }
}
