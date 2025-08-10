package searching;

public class Count1sBinaryArray {
    public static void main(String[] args) {

        int arr[] = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(countOnes(arr));
    }
    public static int countOnes(int[] arr) {
        int size = arr.length;
        int count = 0;
        for(int i = 0; i < size; i++){
            if(arr[i] != 1){
                break;
            }
            ++count;
        }
        return count;
    }
}
