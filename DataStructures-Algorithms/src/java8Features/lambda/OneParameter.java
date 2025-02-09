package java8Features.lambda;

// Single parameter with direct call to lambda functional interface
public class OneParameter {
    public static void main(String[] args) {
        OneParameterInter oneParameterInter = (name) -> System.out.println("Welcome to the World! : " + name); // Direct call to the lambda function
        oneParameterInter.display("Developer");
    }

}

@FunctionalInterface // optional
interface OneParameterInter {
    void display(String name);
}
