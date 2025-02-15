package ch01_make_stream.ch01_array_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        String[] strArr=new String[]{"apple","banana","cat"};

        Stream<String> strStream= Arrays.stream(strArr,0,2);
        strStream.forEach(str->System.out.print(str+" "));

        Arrays.stream(strArr).forEach(System.out::print);
    }
}
