package array;

public class RearrangeAnArray {

    public static void main(String[] args) {

        long arr[] = {4,0,2,1,3};
        RearrangeAnArray anArray = new RearrangeAnArray();

        anArray.arrange(arr);
        for(long i : arr){
            System.out.print(i);
        }
    }

    public void arrange(long[] arr) {
        int size = arr.length;
        long arr1[] = new long[size];
        for(int i = 0; i < size; i++){
            int x = (int) arr[i];
            arr1[i] = arr[x];
        }

        for(int i = 0; i < size; i++){
            arr[i] = arr1[i];
        }
    }

}
