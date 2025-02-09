package java8Features.lambda.lambdaExpressionParameter;

public class ZeroParameter {

    public static void dis(ZeroP p){
        p.display();
    }
    public static void main(String[] args) {
        dis(()-> System.out.println("Welcome to the Developer World!"));
    }
}

interface ZeroP{
    void display();
}