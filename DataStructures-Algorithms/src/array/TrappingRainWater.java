package array;

public class TrappingRainWater {

    public static void main(String[] args) {

        int arr[] = {3, 0, 1, 0, 4, 0, 2};
        int trapUnit = maxWater(arr);
        System.out.println(trapUnit);
    }

    public static int maxWater(int arr[]) {

        int size = arr.length;

        int maxLeftToRight[] = new int[size];
        int maxRightToLeft[] = new int[size];

        maxLeftToRight[0] = arr[0];
        maxRightToLeft[size - 1] = arr[size - 1];

        for (int i = 1; i < size; i++) {
            if (maxLeftToRight[i - 1] < arr[i]) {
                maxLeftToRight[i] = arr[i];
            } else {
                maxLeftToRight[i] = maxLeftToRight[i - 1];
            }
        }

        for (int i = size - 2; i >= 0; i--) {
            if (maxRightToLeft[i + 1] < arr[i]) {
                maxRightToLeft[i] = arr[i];
            } else {
                maxRightToLeft[i] = maxRightToLeft[i + 1];
            }
        }

        int res = 0;
        for (int i = 0; i < size; i++) {
            int min = Math.min(maxLeftToRight[i], maxRightToLeft[i]);
            res += min - arr[i];
        }

        return res;
    }


}
