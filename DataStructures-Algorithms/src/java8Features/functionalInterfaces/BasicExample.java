package java8Features.functionalInterfaces;

@FunctionalInterface
interface Square{
    int squ(int a);
}

public class BasicExample {

    public static void main(String[] args) {

        Square square = (a)->{return a*a;};
        System.out.println(square.squ(10));
    }

}
