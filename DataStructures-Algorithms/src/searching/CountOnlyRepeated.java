package searching;

import java.util.ArrayList;

public class CountOnlyRepeated {
    public static void main(String[] args) {

        int arr[] = {1,2,3,3,3};
        ArrayList<Integer> repeating = findRepeating(arr);
        for(int i : repeating){
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> findRepeating(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int size = arr.length;
        int count = 0;
        int value = 0;
        for(int i = 1; i < size; i++){
            if(arr[i - 1] != arr[i]){
                continue;
            }
            ++count;
            value = arr[i];
        }
        if(0 < count){
            list.add(value);
            list.add(count+1);
            return list;
        }
        list.add(-1);
        list.add(-1);
        return list;
    }
}
