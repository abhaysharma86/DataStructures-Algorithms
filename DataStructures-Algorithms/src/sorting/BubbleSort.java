package sorting;

public class BubbleSort {
    /*

    1. Bubble Sort

    Idea: Repeatedly swap adjacent elements if they are in the wrong order.
    Time: O(n²), Best: O(n) (already sorted)
    Space: O(1)
    Use: Teaching, tiny datasets, nearly sorted arrays.

    Given an array, arr[]. Sort the array using bubble sort algorithm.
***********************************************************************************************
    Examples 1:

    Input: arr[] = [4, 1, 3, 9, 7]
    Output: [1, 3, 4, 7, 9]
    Explanation: After Sorting the array in ascending order of their values is [1, 3, 4, 7, 9].

    Examples 2:

    Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    Explanation: Sort the array in ascending order of their values.

    Examples 3:

    Input: arr[] = [1, 2, 3, 4, 5]
    Output: [1, 2, 3, 4, 5]
    Explanation: An array that is already sorted should remain unchanged after applying bubble sort.


    */
    public static void main(String[] args) {

        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);

        for(int i : arr){
            System.out.print("[" + i +"]");
        }

    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size - 1; i++){
            for(int j = 1; j < size - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
