package stack;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
    public static ArrayList<Integer> calculateSpan(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> first = new Stack<>();
        Stack<Integer> sec = new Stack<>();


        for(int i : arr){
            if(first.isEmpty()){
                list.add(1);
                first.push(i);
            }else{
                if(first.peek() > i){
                    list.add(1);
                    first.push(i);
                }else{
                    int count = 0;
                    while(!first.isEmpty() && first.peek() <= i){
                        sec.push(first.pop());
                        count++;
                    }
                    list.add(count+1);
                    while(!sec.isEmpty()){
                        first.push(sec.pop());
                    }
                    first.push(i);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = {7 ,10, 4, 8, 7, 2};
        long start = System.currentTimeMillis();

        System.out.println(StockSpanProblem.calculateSpan(arr));
        long end = System.currentTimeMillis();

        System.out.println("Duration :" +(start - end));

    }
}
// [1, 2, 1, 2, 1, 1]
// [1, 2, 3, 1, 1, 2, 4, 1, 9, 1]


//    public ArrayList<Integer> calculateSpan(int[] arr) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//        int size = arr.length;
//
//        if(size < 1){
//            list.add(1);
//            return list;
//        }
//
//        list.add(1);
//
//        for(int i = 1; i < size; i++){
//            if(arr[i - 1] > arr[i]){
//                list.add(1);
//            }else{
//                int j = i - 1;
//                while(0 <= j && arr[j] <= arr[i]){
//                    --j;
//                }
//                list.add(i - j);
//            }
//        }
//
//        return list;
//    }
//}