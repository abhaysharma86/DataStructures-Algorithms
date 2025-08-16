package searching;

import java.util.Arrays;

public class MedianTwoSortedArrays {
    /*

    Given two sorted arrays of sizes N and M respectively. The task is to find the median of the two arrays when they get merged.
    If there are even number of elements in the resulting array, find the floor of the average of two medians.

    Example 1:

    Input:
    N = 5, M = 6
    arr[] = {1,2,3,4,5}
    brr[] = {3,4,5,6,7,8}
    Output: 4
    Explanation: After merging two arrays,
    elements will be as 1 2 3 3 4 4 5 5 6 7 8
    So, median is 4.

    Example 2:

    Input:
    N = 2, M = 3
    arr[] = {1,2}
    brr[] = {2,3,4}
    Output: 2
    Explanation: After merging two arrays,
    elements will be as 1 2 2 3 4. So,
    median is 2.

    */
    public static void main(String[] args) {

        int N = 2, M = 3;
        int arr[] = {1,2},  brr[] = {3,4,5};
        int median = findMedian(arr, N, brr, M);
        System.out.println(median);
    }

    public static int findMedian(int arr[], int n, int brr[], int m) {
        int ar[] = new int[n+m];
        merge(arr,n,0,ar);
        merge(brr,m,n,ar);
        Arrays.sort(ar);
        int min = ar.length/2;
        if(n == m){
            return ar[min - 1];
        }
        return ar[min];
    }
    static void merge(int arr[], int size,int in, int ar[]){
        for(int i = 0; i < size; i++){
            ar[in++] = arr[i];
        }
    }
}
