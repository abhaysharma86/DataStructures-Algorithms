package array;

import java.util.HashMap;
import java.util.Map;

public class SmallestPositiveMissing {

    public static void main(String[] args) {

        int arr[] = {1,2,4,5};
        Map<Integer, Integer>  map = new HashMap<>();

        int i = missingNumber(arr);
        System.out.println(i);
    }

    public static int missingNumber(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(0 < i){
                map.put(i,i);
            }
        }

        for(int i = 1; i < arr.length + 1; i++){
            if(map.get(i) == null){
                return i;
            }
        }
        return map.get(map.size())+1;
    }

}
