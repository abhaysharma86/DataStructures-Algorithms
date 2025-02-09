package java8Features.lambda;

public class OneParameter {

    public static void main(String[] args) {
        OneParameterInter oneParameterInter = (name) -> System.out.println("Welcome to the World! : " + name);
        oneParameterInter.display("Developer");
    }

}

@FunctionalInterface // optional
interface OneParameterInter {
    void display(String name);
}
