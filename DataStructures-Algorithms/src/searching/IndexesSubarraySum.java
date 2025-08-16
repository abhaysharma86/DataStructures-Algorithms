package searching;

import java.util.ArrayList;

public class IndexesSubarraySum {
    public static void main(String[] args) {
        int arr[] = {5, 3, 4};
        int target = 2;
        System.out.println(subarraySum(arr,target));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = arr.length;
        int sum = 0;
        for(int i = 0; i < size; i++ ){
            for(int j = i; j < size; j++){
                sum+=arr[j];
                if(sum == target){
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }

            }
            sum = 0;
        }
        list.add(-1);
        return list;
    }
}
