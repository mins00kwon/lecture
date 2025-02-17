package ch02_intermediate_operation.ch03_flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<List<String>> list= Arrays.asList(
                Arrays.asList("JAVA","SPRING","SPTRINGBOOT"),
                Arrays.asList("java","spring","springboot")
        );
        list.forEach(System.out::println);
        list.stream()
                .flatMap(list1 -> list1.stream())
//                .flatMap(Collection::stream)
                .forEach(s->System.out.print(s+" "));
    }
}
