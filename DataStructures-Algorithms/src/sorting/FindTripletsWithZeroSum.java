package sorting;

public class FindTripletsWithZeroSum {

    public static void main(String[] args) {
    int arr[] = {-26, 22, -35, 0, -20, -11, 0, -47, -36, 4};
        System.out.println(findTriplets(arr));
    }
    public static boolean findTriplets(int[] arr) {

        int size = arr.length;

        for(int i = 0; i < size; i++){
            for(int j = 1; j < size - i; j++){
                if(arr[j-1] > arr[j]){
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                }
            }
        }

        if(size < 3)return false;

        for(int i = 2; i < size; i++){
            int a1 = arr[i-2];
            int a2 = arr[i-1];
            int a3 = arr[i];
            int sum = a1+a2+a3;
            if(sum == 0){
                return true;
            }
        }

    return false;
    }

}
