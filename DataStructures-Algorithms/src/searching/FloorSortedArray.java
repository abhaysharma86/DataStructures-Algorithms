package searching;

public class FloorSortedArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int x = 0;
        System.out.println(findFloor(arr, x));
    }

    public static int findFloor(int[] arr, int x) {
        int size = arr.length;
        int index = -1;
        for(int i = 0; i < size; i++){
            if(x >= arr[i]){
                index = i;
            }
        }
        return index;
    }

}
