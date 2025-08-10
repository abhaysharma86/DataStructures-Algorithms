package searching;

public class MinimumNumberSortedRotatedArray {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,0};

        System.out.println(minNumber(arr));

    }

    static int minNumber(int arr[]) {
        int size = arr.length;

        if(arr[0] < arr[size - 1]){
            return arr[0];
        }
        int min = arr[size - 1];
        for(int i = size - 2; i > 0; i--){
            if(arr[i] < min){
                min = arr[i];
            }else{
                break;
            }
        }
        return min;
    }
}
