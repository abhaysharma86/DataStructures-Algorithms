package searching;

public class LeftIndex {

    public static void main(String[] args) {
        int  arr[] = {10, 20, 20, 20, 20, 20, 20};
        int x = 20;
        int i = leftIndex(arr, x);
        System.out.println(i);
    }

    public static int leftIndex(int[] arr, int x) {
        int size = arr.length;

        for(int i = 0; i < size; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

}
