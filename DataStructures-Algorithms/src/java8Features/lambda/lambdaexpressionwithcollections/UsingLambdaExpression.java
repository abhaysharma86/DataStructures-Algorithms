package java8Features.lambda.lambdaexpressionwithcollections;

import java.util.ArrayList;
import java.util.Collections;

// Sorting Collections with Comparator (or without Lambda): We can use Comparator interface to sort,
// It only contains one abstract method: – compare(). An interface that only contains only a single abstract method then it is called a Functional Interface.
//
//        Use of Comparator(I): –
//        Prototype of compare() method: –
//        While defining our own sorting, JVM is always going to call Comparator to compare() method.
//
//        returns negative value(-1), if and only if obj1 has to come before obj2.
//        returns positive value(+1), if and only if obj1 has to come after obj2.
//        returns zero(0), if and only if obj1 and obj2 are equal.
//        In List, Set, Map, or anywhere else when we want to define our own sorting method, JVM will always call compare() method internally. When there is Functional Interface concept used, then we can use Lambda Expression in its place. Sorting elements of List(I) with Lambda
//
//        Expression: – Using lambda expression in place of comparator object for defining our own sorting in collections.



public class UsingLambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();

        integers.add(10);
        integers.add(1);
        integers.add(30);
        integers.add(0);
        integers.add(121);
        integers.add(19);
        integers.add(11);

        Collections.sort(integers, (al1,al2)->(al1 > al2) ? -1 : (al1 < al2) ? 1 : 0);
        System.out.println(integers);
    }

}
