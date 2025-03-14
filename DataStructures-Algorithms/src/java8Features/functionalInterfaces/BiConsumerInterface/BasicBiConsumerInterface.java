package java8Features.functionalInterfaces.BiConsumerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BasicBiConsumerInterface {


    BiConsumer<List<Integer>, List<String>> listListBiConsumer = (list1, list2)->{

        if(list1.size() == list2.size())
            for (int i = 0; i < list1.size(); i++){
                System.out.println("Key : " + list1.get(i) + ", Value : "+list2.get(i));
            }
    };

    public static void main(String[] args) {

        List<Integer> key = new ArrayList<>();
        key.add(1);
        key.add(2);
        key.add(3);
        key.add(4);
        key.add(5);

        List<String> value = new ArrayList<>();
        value.add("A");
        value.add("B");
        value.add("C");
        value.add("D");
        value.add("E");

        BasicBiConsumerInterface anInterface = new BasicBiConsumerInterface();
        anInterface.listListBiConsumer.accept(key,value);
    }

}
