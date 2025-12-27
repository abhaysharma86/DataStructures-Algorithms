package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {

        StackUsingQueue queue = new StackUsingQueue();
        System.out.println(queue.size());
        System.out.println(queue.top());
        queue.push(10);
        System.out.println(queue.top());

    }

    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        if(q.size() == 0){
            q.add(x);
        }else{
            int s = q.size();
            q.add(x);
            while(s != 0){
                q.add(q.poll());
                --s;
            }
        }

    }

    void pop() {
        if(!q.isEmpty()){
            q.poll();
        }
    }

    int top() {
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }

    int size() {
        return q.size();
    }
}
