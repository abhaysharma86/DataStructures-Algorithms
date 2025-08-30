package sorting;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int a[] = {0, 1}, b[] = {2, 3};
        mergeArrays(a, b);
    }

    public static void mergeArrays(int a[], int b[]) {
        int size_a = a.length;
        int size_b = b.length;
        for (int i = 0; i < size_a; i++) {
            if (a[i] > b[0]) {
                int t = a[i];
                a[i] = b[0];
                b[0] = t;
                for (int j = 1; j < size_b; j++) {
                    if (t < b[j]) {
                        break;
                    }
                    b[j - 1] = b[j];
                    b[j] = t;

                }
            }
        }


        for (int i : a) {
            System.out.print("[" + i + "]");
        }
        System.out.println("");
        for (int i : b) {
            System.out.print("[" + i + "]");
        }
    }


}
