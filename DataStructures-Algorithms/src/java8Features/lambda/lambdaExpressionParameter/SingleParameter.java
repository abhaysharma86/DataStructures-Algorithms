package java8Features.lambda.lambdaExpressionParameter;

public class SingleParameter {

    // Lambda function, Passing as a variable input parameter
    public static void dis(SingleP p, String name) {
        p.display(name);
    }

    public static void main(String[] args) {
        dis((name) -> System.out.println("Welcome to the Our world! "+ name), "Developer");
    }

}

interface SingleP {
    void display(String name);
}
