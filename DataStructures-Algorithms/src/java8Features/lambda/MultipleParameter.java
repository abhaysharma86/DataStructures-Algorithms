package java8Features.lambda;

// Multiple parameter with direct call to lambda functional interface
public class MultipleParameter {
    public static void main(String[] args) {
        MultiplePara multiplePara = (age, name) -> {
            System.out.println("Welcome to the Developer World! : " + name +" age : " + age ); // Direct call to the lambda function
        };

        multiplePara.display(30, "Abhay Sharma");
    }
}
interface MultiplePara{
    void display(int age, String name);
}
