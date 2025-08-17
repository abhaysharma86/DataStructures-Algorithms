package sorting;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int a[] = {1, 3, 4 ,4 ,5, 7, 7, 8}, b[] = {6 ,7 ,9 ,9 ,9};
        mergeArrays(a, b);
    }

    // A [0, 1, 2, 3]
    // B [7, 5, 6, 8, 9]


    public static void mergeArrays(int a[], int b[]) {
        int size_a = a.length;
        int size_b = b.length;
        for (int i = 0; i < size_a; i++) {
            int t = a[i];
            int in = -1;
            for(int j = 0; j < size_b; j++){
                if(t > b[j]){
                    t = b[j];
                    in = j;
                }
            }
            if(in != -1){
                int x = a[i];
                a[i] = b[in];
                b[in] = x;
            }

        }
//        sort(a);
        sort(b);

        for (int i : a) {
            System.out.print("[" + i + "]");
        }
        System.out.println("");
        for (int i : b) {
            System.out.print("[" + i + "]");
        }
    }

    public static void sort(int arr[]) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int t = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
