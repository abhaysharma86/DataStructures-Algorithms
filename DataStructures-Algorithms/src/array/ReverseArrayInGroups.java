package array;

public class ReverseArrayInGroups {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int k = 3;

        ReverseArrayInGroups groups = new ReverseArrayInGroups();
        groups.reverseInGroups(arr, k);

        for (int i : arr) {
            System.out.print("[" + i + "]");
        }

    }


    public void reverseInGroups(int[] arr, int k) {

        int size = arr.length;

        if (size < k || size == k) {
            reverseArray(arr, 0, size - 1);
            return;
        }

        for (int i = 0; i < size; i++) {

            if (k < (size - i)) {
                reverseArray(arr, i, k-1);
                i = k-1;
            } else {
                reverseArray(arr, i, size - 1);
            }
        }

    }

    private void reverseArray(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
