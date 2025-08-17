package sorting;

public class InsertionSort {

    /*
        Given an array arr[] of positive integers.The task is to complete the insertsort() function which is used to implement Insertion Sort.

        Examples 1:

        Input: arr[] = [4, 1, 3, 9, 7]
        Output: [1, 3, 4, 7, 9]
        Explanation: The sorted array will be [1, 3, 4, 7, 9].

         Examples 2:

        Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Explanation: The sorted array will be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].

    */

    public static void main(String[] args) {

        int arr[] = {4, 1, 3, 9, 7};

        insertionSort(arr);
        for (int i : arr) {
            System.out.print("[" + i + "]");
        }


    }

    public static void insertionSort(int arr[]) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int min_ind = arr[i];
            int ind = 0;
            for (int j = i; j < size; j++) {
                if (arr[j] < min_ind) {
                    min_ind = arr[j];
                    ind = j;
                }
            }
            if (ind != 0) {
                int t = arr[ind];
                arr[ind] = arr[i];
                arr[i] = t;
            }
        }

    }
}
