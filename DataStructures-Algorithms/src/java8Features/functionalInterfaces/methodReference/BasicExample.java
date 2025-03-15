package java8Features.functionalInterfaces.methodReference;

import java.util.Arrays;

public class BasicExample {

    public static void show(String str)
    {
        System.out.println("Value :"+str);
    }

    public static void main(String[] args) {

        String names[] = {"A","B","C","D"};

        Arrays.stream(names).forEach(BasicExample::show);


    }

}

