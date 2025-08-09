package searching;

public class SortedArraySearch {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 6};
        int k = 6;
        System.out.println(searchInSorted(arr, k));
    }

    static boolean searchInSorted(int arr[], int k) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == k) {
                return true;
            }
        }
        return false;
    }
}
