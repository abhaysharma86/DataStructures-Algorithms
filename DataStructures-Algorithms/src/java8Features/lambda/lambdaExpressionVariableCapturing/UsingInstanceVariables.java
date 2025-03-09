package java8Features.lambda.lambdaExpressionVariableCapturing;


interface MyInterface {
    void myFunction();
}
public class UsingInstanceVariables {
    // Custom initialization
    int data = 170; // Instance variable

    // Main driver method
    public static void main(String[] args) {
        // Creating object of this class
        UsingInstanceVariables usingInstanceVariables = new UsingInstanceVariables();

        // Creating object of interface
        MyInterface intFace = () -> {
            System.out.println("Data: " + usingInstanceVariables.data);
            usingInstanceVariables.data += 500;
            System.out.println("Data after modification: " + usingInstanceVariables.data);
        };

        // Using the lambda expression
        intFace.myFunction();

        // Modifying the instance variable
        usingInstanceVariables.data += 200;
        System.out.println("Final Data: " + usingInstanceVariables.data);
    }
}

//    Explanation of the Program:
//        In this example, the lambda expression modifies an instance variable data of the enclosing class UsingInstanceVariables.
//        Unlike local variables, instance variables are not subject to the effectively final restriction, so they can be modified
//        both inside and outside the lambda expression.

//Note:
// It is important to emphasize that a lambda expression can use and modify an instance variable from its invoking class.
// It just can’t use a local variable of its enclosing scope unless that variable is effectively final.


