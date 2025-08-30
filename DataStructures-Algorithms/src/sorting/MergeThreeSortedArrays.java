package sorting;

import java.util.ArrayList;
import java.util.HashMap;

public class MergeThreeSortedArrays {

    public static void main(String[] args) {
        int a[] = {1, 2}, b[] = {2, 3, 4}, c[] = {4, 5, 6, 7};
        ArrayList<Integer> list = mergeThree(a, b, c);
        System.out.println(list);
    }

    public static ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {

        int size_a = a.length;
        int size_b = b.length;
        int size_c = c.length;
        int max = Math.max(a[size_a - 1], Math.max(b[size_b - 1], c[size_c - 1]));
        int arr[] = new int[max+1];

        int max1 = Math.max(size_a, Math.max(size_b, size_c));

        for(int i = 0; i < max1; i++){
            if(i < size_a){
                int i1 = arr[a[i]];
                arr[a[i]] = i1+1;
            }
            if(i < size_b){
                int i2 = arr[b[i]];
                arr[b[i]] = i2+1;
            }
            if(i < size_c){
                int i3 = arr[c[i]];
                arr[c[i]] = i3+1;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                for(int j = 0; j < arr[i]; j++){
                    list.add(i);
                }
            }
        }

        return list;
    }

}
