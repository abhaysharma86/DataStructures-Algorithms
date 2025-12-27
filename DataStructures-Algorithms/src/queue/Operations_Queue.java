package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Operations_Queue {
    public static void main(String[] args) {

        Operations_Queue queue1 = new Operations_Queue();
        System.out.println(queue1.isEmpty());
        queue1.enqueue(3);
        queue1.enqueue(6);
        System.out.println(queue1.getRear());
    }

    Queue<Integer> queue = null;
    int rear = 0;

    public Operations_Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int x) {
        queue.add(x);
        rear = x;
    }

    public void dequeue() {
        if(!queue.isEmpty()){
            queue.poll();
        }
    }

    public int getFront() {
        if(!queue.isEmpty()){
            return queue.peek();
        }
        return -1;
    }

    public int getRear() {
        if(!queue.isEmpty()){
            return rear;
        }else{
            return -1;
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
