package stack;

import java.util.Stack;

public class HistogramMaxRectangularArea {
    public static int getMaxArea(int arr[]) {
        int size = arr.length;
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> temp1 = new Stack<>();

        int [] prev = new int[size];
        int [] next = new int[size];

        for(int i = 0; i < size; i++) {

            while (!temp1.isEmpty() && arr[temp1.peek()] >= arr[i]){
                temp1.pop();
            }
            if(temp1.isEmpty()){
                prev[i] = -1;
            }else {
                prev[i] = temp1.peek();
            }
            temp1.push(i);
        }

        for(int i = size - 1; i > 0; --i) {

            while (!temp.isEmpty() && arr[temp.peek()] >= arr[i]){
                temp.pop();
            }
            if(temp.isEmpty()){
                next[i] = -1;
            }else {
                next[i] = temp.peek();
            }
            temp.push(i);
        }


        return 0;
    }
    public static void main(String[] args) {
    int arr[] = {60, 20, 50, 40, 10, 50, 60};
    getMaxArea(arr);
    }
}
