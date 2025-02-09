package java8Features.lambda;

// Zero parameter with direct call to lambda functional interface
public class ZeroParameter {
    public static void main(String[] args) {
        ZeroParameterInter parameter = () -> System.out.println("Hello World! : Zero Parameter"); // Direct call to the lambda function
        parameter.display();
    }
}

@FunctionalInterface // optional
interface ZeroParameterInter {
    void display();
}
