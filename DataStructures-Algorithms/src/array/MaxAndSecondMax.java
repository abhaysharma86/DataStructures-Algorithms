package array;

import java.util.ArrayList;

public class MaxAndSecondMax {

/*
    Given an array arr[] of positive integers which may have duplicates. The task is to find the maximum and second maximum from the array, and both of them should be different from each other, and If no second maximum exists, then the second maximum will be -1.

    Examples :

    Input: arr[] = [2, 1, 2]
    Output: [2, 1]
    Explanation: In the given array elements, 2 is the maximum and 1 is the second maximum.


    Input: arr[] = [3, 3, 3]
    Output: [3, -1]
    Explanation: In the given array, 3 is the maximum, and since no distinct smaller element exists, the second maximum is -1.
    */


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int arr[] = {2, 1, 2};


        int min = 0;
        int max = 0;
        int index = 0;
        while(index < arr.length){
            if(max < arr[index]){
                min = max;
                max = arr[index];
            }else if(min < arr[index] && max > arr[index]){
                min = arr[index];
            }
            index++;
        }
        list.add(max);
        if(min == 0){
            list.add(-1);
        }else{
            list.add(min);
        }
        System.out.println(list);
    }
}
