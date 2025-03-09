package java8Features.lambda.lambdaexpressionwithcollections;

import java.util.TreeSet;

public class SortingTreeSetUsingLambdaExpression {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>((o1, o2)->(o1>o2) ? -1 : (o1 < o2) ? 1 : 0);

        integers.add(144);
        integers.add(10987);
        integers.add(15);
        integers.add(17);
        integers.add(100);
        System.out.println(integers);
    }
}
