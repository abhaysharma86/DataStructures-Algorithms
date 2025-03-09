package java8Features.lambda.lambdaexpressionwithcollections;

import java.util.TreeMap;

public class SortingElementsTreeMapUsingLambdaExpression {

    public static void main(String[] args) {
        TreeMap<Integer , String> map = new TreeMap<>((o1, o2)->(o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);

        map.put(1,"Apple");
        map.put(23, "Orange");
        map.put(21, "Mango");
        map.put(10, "Banana");

        System.out.println(map);


    }
}
