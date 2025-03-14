package java8Features.functionalInterfaces.consumerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ExampleAndThenMethod {

    public static void main(String[] args) {
        try {

            Consumer<List<Integer>> listConsumer = list->list.forEach(v-> System.out.println(v*v));
            Consumer<List<Integer>> stringConsumer = message-> System.out.println("message "+message);

            Consumer<List<Integer>> listConsumer1 = listConsumer.andThen(stringConsumer);

            List<Integer> integers= new ArrayList<>();
            integers.add(1);
            integers.add(2);
            integers.add(3);
            integers.add(4);

            listConsumer1.accept(integers);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
