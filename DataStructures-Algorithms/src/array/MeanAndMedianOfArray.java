package array;

import java.util.Arrays;

class MeanAndMedianOfArray {

    /*

        Given an array of positive integer arr[]. Find the mean and median of the array.
        Where mean is the average value of the given array, median is the average of the two middle elements.

        Note: Return the floor value of mean and median.

        Examples:

        Input: arr[] = [1, 2, 19, 28, 5]
        Output: 11 5
        Explanation: mean is (1 + 2 + 19  + 28  + 5)/5 = 11.
        median is 5 (middle element after sorting)

        Input: arr[] = [2, 8, 3, 4]
        Output: 4 3
        Explanation: mean is floor ((2 + 8 + 3 + 4)/4) = 4.
        median is floor ((3 + 4)/2) = 3


    */

    public static void main(String[] args) {
        MeanAndMedianOfArray solution = new MeanAndMedianOfArray();
        int arr[] ={1, 2, 19, 28, 5};

        int mean = solution.mean(arr);
        int median = solution.median(arr);
        System.out.println(mean);
        System.out.println(median);

    }
    public int mean(int[] arr) {
        int size = arr.length;
        if(size <= 0)
          return 0;
        
        int sum = 0;
        
        for(int i = 0; i < size; i++){
            sum+=arr[i];
        }
        return sum/size;
    }

    public int median(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        
        if(size < 2)
         return arr[0];
        
        int mid = size / 2;
        if(size % 2 == 0){
           int res = arr[mid-1];
           res+=arr[mid];
           return res/2;
        }
        return arr[mid];
    }
}