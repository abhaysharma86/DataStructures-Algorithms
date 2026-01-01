package deque;

import java.util.ArrayList;

public class KSizedSubarrayMaximum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        System.out.println( maxOfSubarrays(arr,3));
    }
    public static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < (arr.length - k) + 1; i++){
            int v = 0;
            for(int j = i; j < k + i; j++){
                if(v < arr[j]){
                    v = arr[j];
                }
            }
            list.add(v);
        }
        return list;
    }
}
