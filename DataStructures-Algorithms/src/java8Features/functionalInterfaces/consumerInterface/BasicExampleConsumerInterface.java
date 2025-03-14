package java8Features.functionalInterfaces.consumerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BasicExampleConsumerInterface {

    public static void main(String[] args) {

        // 1 approach
        Consumer<List<Integer>> listConsumer = (list)-> System.out.println(list);

        // 2 approach
        Consumer<List<Integer>> listConsumer1 = list-> System.out.println(list);

        // 3 approach
        Consumer<List<Integer>> listConsumer2 = list1->{
            list1.forEach(value-> System.out.println("["+value+"]"));
        };

        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        listConsumer.accept(integers); // call 1 approach
        listConsumer1.accept(integers); // call 2 approach
        listConsumer2.accept(integers); // call 3 approach

    }

}
