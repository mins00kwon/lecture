package section03_method_reference;

import java.lang.reflect.Member;
import java.util.function.Function;
import java.util.function.Supplier;

public class StudyConstructorReference {
    public static void main(String[] args) {
        Function<String,ExampleClass> function = ExampleClass::new;
        ExampleClass exampleClass = function.apply("Hello");
        Supplier<ExampleClass> supplier = ExampleClass::new;
        ExampleClass exampleClass1 = supplier.get();
    }
}
