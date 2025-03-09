package java8Features.lambda.lambdaExpressionVariableCapturing;

public class EffectivelyFinal_MutableLocalVariables {

    interface MyFunction {

        // Method inside the interface
        int func(int n);
    }
    // Main driver method
    public static void main(String[] args)
    {

        // Custom local variable that can be captured
        int number = 10;

        MyFunction myLambda = (n) ->
        {

            // This use of number is OK It does not modify
            // num
            int value = number + n;

            // However, the following is illegal because it
            // attempts to modify the value of number

            // number++;
            return value;
        };

        //Using the Lambda expression
        System.out.println(myLambda.func(20));
    }
}
//    Explanation of the Program:
//        As the comments indicate, number is effectively final and can, therefore, be used inside myLambda. However,
//        if number were to be modified, either inside the lambda or outside of it, number would lose its effective final status.
//        This would cause an error, and the program would not compile.