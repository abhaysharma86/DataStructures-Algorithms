package searching;

import java.util.HashMap;
import java.util.Map;

public class TwoRepeatedElements {
    public static void main(String[] args) {
        int n = 2;
        int arr[] = {1 ,2, 1, 3, 4, 3};
        int[] ints = twoRepeated(arr);
        for (int i : ints) {
            System.out.print("[" + i + "]");
        }
    }

    public static int[] twoRepeated(int[] arr) {
        int size = arr.length;

        Map<Integer, Integer> map = new HashMap<>();
        int[] ar = new int[2];

        for (int i = 0; i < size; i++) {
            int t = arr[i];
            if (map.containsKey(t)) {
                map.put(t, i);
            } else {
                map.put(t, -1);
            }
        }
        int i = 0;
        for (Map.Entry<Integer,Integer> k : map.entrySet()) {
            int value = k.getValue();
            if (value != -1) {
                ar[i] = value;
                i++;
            }
        }

        int x1 = ar[0];
        int x2 = ar[1];
        if (x1 < x2) {
            ar[0] = arr[x1];
            ar[1] = arr[x2];
            return ar;
        }

        ar[0] = arr[x2];
        ar[1] = arr[x1];
        return ar;
    }
}
