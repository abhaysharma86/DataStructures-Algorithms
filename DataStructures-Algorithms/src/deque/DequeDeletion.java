package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DequeDeletion {
    public static void main(String[] args) {

        // 64 36 22 14 99 30 94
        //1 4

        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(64);
        integers.add(36);
        integers.add(22);
        integers.add(14);
        integers.add(99);
        integers.add(30);
        integers.add(94);
//        eraseAt(integers, 2);
//        eraseInRange(integers,1,3);
//        eraseAll(integers);
//        integers.forEach(i-> System.out.print(i + " "));
//        System.out.println(integers);
        printDeque(integers);
    }


    public static void printDeque(ArrayDeque<Integer> deq) {
        while(!deq.isEmpty()){
            System.out.print(deq.pop() + " ");
        }
    }

    public static void eraseAt(ArrayDeque<Integer> deq, int X) {

        if(deq.size() < X){
            return;
        }

        Stack<Integer> st = new Stack<>();
        int index = 0;

            while(index < X){
                st.push(deq.pollFirst());
                ++index;
            }

            deq.pollFirst();

            while(!st.isEmpty()){
                deq.addFirst(st.pop());
            }
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        if(start == end || end < start){
            return;
        }
        Stack<Integer> st1 = new Stack<>();
        int index = 0;

        while(index < start){
            st1.push(deq.pollFirst());
            ++index;
        }
        index = start;
        while(index < end){
            deq.pollFirst();
            ++index;
        }

        while(!st1.isEmpty()){
            deq.addFirst(st1.pop());
        }

    }


    public static void eraseAll(ArrayDeque<Integer> deq) {
        while(!deq.isEmpty()){
            deq.pop();
        }
    }
}
