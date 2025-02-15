package ch01_make_stream.ch03_collection_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a"); list.add("b"); list.add("c"); list.add("d");
        Stream<String> stream = list.stream();
        stream.forEach(str -> System.out.print(str+" "));
        list.forEach(str->System.out.print(str+" "));
    }
}
