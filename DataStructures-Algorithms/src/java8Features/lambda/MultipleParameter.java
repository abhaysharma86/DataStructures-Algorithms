package java8Features.lambda;

import javax.xml.stream.StreamFilter;
import java.util.stream.Stream;

public class MultipleParameter {
    public static void main(String[] args) {
        MultiplePara multiplePara = (age, name) -> {
            System.out.println("Welcome to the Developer World! : " + name +" age : " + age );
        };

        multiplePara.display(30, "Abhay Sharma");
    }
}
interface MultiplePara{
    void display(int age, String name);
}
