package section03_method_reference;

public class ExampleClass {
    private String name;

    public ExampleClass() {
        System.out.println("기본 생성장");
    }

    public ExampleClass(String name) {
        System.out.println("매개변수 생성자");
        this.name = name;
    }
}
