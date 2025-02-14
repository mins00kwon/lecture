package section02_standard_functional_interface;

import java.util.function.Supplier;

public class StudySupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }
}
