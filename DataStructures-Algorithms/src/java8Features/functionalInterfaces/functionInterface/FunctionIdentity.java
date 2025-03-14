package java8Features.functionalInterfaces.functionInterface;

import java.util.function.Function;

public class FunctionIdentity
{
    // Main driver method
    public static void main(String args[])
    {
        // Function which takes in a number and
        // returns it
        Function<Integer, Integer> i = Function.identity();

        // Print statement
        System.out.println(i.apply(10));
    }
}
