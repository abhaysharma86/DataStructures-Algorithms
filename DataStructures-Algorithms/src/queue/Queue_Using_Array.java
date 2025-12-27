package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Using_Array {
    public static void main(String[] args) {

        Queue_Using_Array obj = new Queue_Using_Array(2);

        System.out.println(obj.getRear());
        obj.enqueue(3);
        obj.enqueue(7);
        System.out.println(obj.isFull());

    }

    int queue[] = null;
    int size = 0;
    int capicty = -1;

    // Constructor
    public Queue_Using_Array(int n) {
        queue = new int[n];
        size = n;
    }

    public boolean isEmpty() {
        return capicty == -1;
    }

    public boolean isFull() {
        return capicty == size - 1;
    }

    public void enqueue(int x) {
        if(!isFull()){
            queue[++capicty] = x;
        }
    }

    public void dequeue() {
        if(!isEmpty()){
            for(int i = 1; i <= capicty; i++){
                queue[i - 1] = queue[i];
            }
            --capicty;
        }
    }

    public int getFront() {
        return !isEmpty() ? queue[0] : -1;
    }

    public int getRear() {
        return !isEmpty() ? queue[capicty] : -1;
    }
}
