package java8Features.lambda;

public class ZeroParameter {
    public static void main(String[] args) {
        ZeroParameterInter parameter = () -> System.out.println("Hello World! : Zero Parameter");
        parameter.display();
    }
}

@FunctionalInterface // optional
interface ZeroParameterInter {
    void display();
}
