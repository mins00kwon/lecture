package ch01_make_stream.ch02_primitive_data_array_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream intStream=Arrays.stream(intArray);
        intStream.forEach(i->System.out.print(i+" "));
    }
}
