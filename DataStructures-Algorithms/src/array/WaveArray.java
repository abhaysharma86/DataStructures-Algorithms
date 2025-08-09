package array;

public class WaveArray {

    /*
    Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place).
    In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on.
    If there are multiple solutions, find the lexicographically smallest one.

    Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.


    Examples:

    Input: arr[] = [1, 2, 3, 4, 5]
    Output: [2, 1, 4, 3, 5]
    Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.

    Input: arr[] = [2, 4, 7, 8, 9, 10]
    Output: [4, 2, 8, 7, 10, 9]
    Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.

    */
    public static void main(String[] args) {

        int arr[] = {2, 4, 7, 8, 9, 10};
        sortInWave(arr);
        for (int i : arr) {
            System.out.print("[" + i + "]");
        }
    }

    public static void sortInWave(int arr[]) {
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
            i++;
        }

    }

}
