package java8Features.lambda.lambdaExpressionParameter;

public class SingleParameter {

    // Lambda function, Passing as a variable input parameter
    public static void dis(SingleP p) {
        p.display();
    }

    public static void main(String[] args) {
        dis(() -> System.out.println("Welcome to the Our world!"));
    }

}

interface SingleP {
    void display();
}
