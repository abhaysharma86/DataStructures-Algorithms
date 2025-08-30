package sorting;

import java.util.*;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {2,3,4,6}, arr2[] = {1,3,4,4,6,8,8,9,11,12};
        ArrayList<Integer> intersection = intersection(arr1, arr2);
        System.out.println(intersection);
    }


    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        int size_a = arr1.length;
        int size_b = arr2.length;

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> integers = new HashMap<>();
        for (int i = 0; i < size_a; i++) {
            for (int j = 0; j < size_b; j++) {
                if (arr1[i] == arr2[j] && !integers.containsKey(arr1[i])) {
                    list.add(arr1[i]);
                    integers.put(arr1[i],arr1[i]);
                }
            }
        }

        return list;
    }

}
