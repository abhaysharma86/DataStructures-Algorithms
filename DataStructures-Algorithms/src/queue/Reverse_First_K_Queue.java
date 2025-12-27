package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_First_K_Queue {
    public static void main(String[] args) {

        Queue<Integer>  queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        Reverse_First_K_Queue queue1 = new Reverse_First_K_Queue();
        Queue<Integer> queue2 = queue1.reverseFirstK(queue, 3);
        System.out.println(queue2);
    }

    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int size = q.size();
        if(size < k){
            return q;
        }
        int s = size - k;
        Stack<Integer> st = new Stack<>();

        while(k > 0){
            st.push(q.poll());
            --k;
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        while(s > 0){
            q.add(q.poll());
            --s;
        }

        return q;
    }
}
