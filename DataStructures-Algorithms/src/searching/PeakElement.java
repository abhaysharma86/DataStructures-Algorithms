package searching;

public class PeakElement {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(peakElement(arr));
    }

    public static int peakElement(int[] arr) {

        int size = arr.length;

        if (size < 3) {
            return 0;
        }

        for (int i = 2; i < size; i++) {
            int a = arr[i - 2];
            int b = arr[i - 1];
            int c = arr[i];
            if (a < b && b > c) {
                return 1;
            }
        }
        return 0;
    }

}
