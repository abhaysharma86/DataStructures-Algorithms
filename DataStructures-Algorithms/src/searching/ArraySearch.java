package searching;

public class ArraySearch {
    public static void main(String[] args) {
        int  arr[] = {1, 2, 3, 4};
        int x = 3;
        System.out.println(search(arr,x));
    }

    public static int search(int arr[], int x) {
        int size = arr.length;
        for(int i = 0; i < size; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
