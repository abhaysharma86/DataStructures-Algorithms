package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {

        Queue<Integer>  queue = new LinkedList<>();
        queue.add(6);
        queue.add(2);
        queue.add(10);
        queue.add(1);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        QueueReversal queueReversal = new QueueReversal();
        queueReversal.reverseQueue(queue);
        System.out.println(queue);


    }
    public void reverseQueue(Queue<Integer> q) {
        int size = q.size();
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }

    }
}
