package array;

import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        RearrangeArrayAlternately.rearrange(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void rearrange(int arr[]) {

        int size = arr.length;
        int arr1[] = new int[size];

        Arrays.sort(arr);
        int i = 0,j = size - 1;
        int index = 0;
        while(i < j){
            arr1[index] = arr[j];
            arr1[index+1] = arr[i];
            j--;
            i++;
            index+=2;
        }
        if(i == j){
            arr1[size - 1] = arr[i];
        }

        for(int l = 0; l < size; l++){
            arr[l] = arr1[l];
        }
    }
}
