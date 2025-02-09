package java8Features.lambda.lambdaExpressionParameter;

public class MultipleParameter {

    public static void dis(MultipleP p, int age, String name) {
        p.display(age, name);
    }

    public static void main(String[] args) {
        dis((age, name) -> {
            System.out.println("Welcome in the Developer World! " + name + " age : " + age);
        }, 29, "developer");
    }

}

interface MultipleP {
    void display(int age, String name);
}
