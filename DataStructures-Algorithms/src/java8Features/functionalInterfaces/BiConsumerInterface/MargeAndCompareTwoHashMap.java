package java8Features.functionalInterfaces.BiConsumerInterface;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MargeAndCompareTwoHashMap {


    BiConsumer<HashMap<String, String>, HashMap<String, String>> mapHashMapBiConsumer = (map1, map2) -> {
        map2.forEach((m1, m2) -> map1.put(m1, m2));
        map1.forEach((m1, m2) -> System.out.println("Key : " + m1 + ", Value : " + m2));
    };

    BiConsumer<HashMap<String, String>, HashMap<String, String>> hashMapCompareBiConsumer = (map1, map2) -> {
        map2.forEach((m1, m2) -> System.out.println("Key is match:" + map1.containsKey(m1) + ", Value is match :" + map1.containsValue(m2)));
    };

    public static void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "A");
        map1.put("2", "B");
        map1.put("3", "C");
        map1.put("4", "D");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("5", "E");
        map2.put("6", "F");
        map2.put("7", "G");
        map2.put("8", "H");

        MargeAndCompareTwoHashMap map = new MargeAndCompareTwoHashMap();
        try {
            BiConsumer<HashMap<String, String>, HashMap<String, String>> hashMapHashMapBiConsumer = map.mapHashMapBiConsumer.andThen(map.hashMapCompareBiConsumer);
            hashMapHashMapBiConsumer.accept(map1, map2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
