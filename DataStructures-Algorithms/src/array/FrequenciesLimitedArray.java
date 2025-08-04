package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequenciesLimitedArray {

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};

        List<Integer> integers = frequencyCount(arr);
        for (int i : integers) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> frequencyCount(int[] arr) {

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int a = map.get(arr[i]);
                map.put(arr[i], ++a);
            } else {
                map.put(arr[i], 1);
            }

        }
        System.out.println(map);
        for (int i = 1; i <= arr.length; i++) {
            if (map.get(i) == null) {
                list.add(0);
            } else {
                list.add(map.get(i));
            }
        }

        return list;

    }
}
