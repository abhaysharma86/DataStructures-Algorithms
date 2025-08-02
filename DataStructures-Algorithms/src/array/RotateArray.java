package array;

public class RotateArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int d = 7;

        rotateArr(arr, d);

        for (int a : arr) {
            System.out.print("[" + a + "]");
        }
    }

    static void rotateArr(int arr[], int d) {
        int size = arr.length;

        if (size == d) {
//            rotateArray(arr, size);
        } else if (size > d) {
            rotateArray(arr, d);
        } else {
            while (d > size) {
                d = d - size;
            }
            rotateArray(arr, d);
        }
    }

    private static void rotateArray(int arr[], int y) {
        for (int i = 0; i < y; i++) {
            int a = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = a;
        }
    }
}
