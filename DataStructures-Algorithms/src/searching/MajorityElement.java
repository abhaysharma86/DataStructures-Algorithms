package searching;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 3, 5, 1};
        int i = majorityElement(arr);
        System.out.println(i);
    }

    static int majorityElement(int arr[]) {
        int size = arr.length;
        if (size == 1) {
            return arr[0];
        }
        int count = 0;
        int key = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            int temp = arr[i];
            if (map.containsKey(temp)) {
                int x = map.get(temp);
                map.put(temp, ++x);
            } else {
                map.put(temp, 1);
            }
        }

        for (Map.Entry<Integer, Integer> in : map.entrySet()) {
            if (count < in.getValue()) {
                count = in.getValue();
                key = in.getKey();
            }
        }

        int diff = size / 2;
        if (count > diff && count != 1) {
            return key;
        }
        return -1;
    }
}
