package searching;

public class SmallestPositiveMissing {

    public static void main(String[] args) {
        int arr[] = {-8, 0, -1, -4, -3};
        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] arr) {
        int size = arr.length;
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int arr1[] = new int[max + 1];

        for (int i = 0; i < size; i++) {
            if(0 < arr[i]){
                arr1[arr[i]] = arr[i];
            }
        }

        if(arr1.length == 1)
            return 1;

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                return i;
            }
        }

        return max+1;
    }

}
