package section01_intro;

public class Application {
    public static void main(String[] args) {
        Calculator calculator=(a,b)->a+b;
        int result=calculator.calculate(10, 20);
        System.out.println(result);
    }
}
