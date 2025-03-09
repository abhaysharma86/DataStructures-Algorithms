package java8Features.lambda.lambdaexpressionwithcollections;

import java.util.TreeSet;

public class ReverseComparatorWithLambdaExpression {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>((o1,o2)->o2.compareTo(o1));
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(20);
        System.out.println(treeSet);
    }
}
