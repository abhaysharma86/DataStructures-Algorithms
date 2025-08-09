package array;

public class KadaneAlgorithm {
/*

    You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].
    Note : A subarray is a continuous part of an array.

    Examples:

    Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
    Output: 11
    Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

    */


    public static void main(String[] args) {

        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        int i = maxSubarraySum(arr);
        System.out.println(i);
    }

    static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int cSum = 0;

        for (int i = 0; i < arr.length; i++) {

            cSum += arr[i];

            if (maxSum < cSum) {
                maxSum = cSum;
            }
            if (cSum < 0) {
                cSum = 0;
            }
        }
        return maxSum;
    }
}
