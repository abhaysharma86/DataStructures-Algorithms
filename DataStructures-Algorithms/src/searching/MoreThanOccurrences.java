package searching;

import java.util.HashMap;
import java.util.Map;

public class MoreThanOccurrences {
    public static void main(String[] args) {

        int arr[] = {1, 4, 7, 7};
        int k = 2;
        System.out.println(countOccurence(arr, k));

    }
    public static int countOccurence(int[] arr, int k) {
        int size = arr.length;
        Map<Integer, Integer> map = new HashMap<>();


        for(int i =0; i < size; i++){
            int temp = arr[i];
            if(map.containsKey(temp)){
                int a = map.get(temp);
                map.put(temp, ++a);
            }else{
                map.put(temp, 1);
            }
        }

        int diff = size/k;
        int count = 0;
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            int x = i.getValue();
            if(diff < x){
                count++;
            }
        }
        return count;
    }
}
