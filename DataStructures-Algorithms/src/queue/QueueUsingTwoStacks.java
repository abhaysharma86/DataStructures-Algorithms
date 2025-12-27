package queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        QueueUsingTwoStacks stacks = new QueueUsingTwoStacks();
        stacks.push(2);
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        stacks.push(4);

    }

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void push(int B) {
        s1.push(B);
    }

    public int pop() {
        int res = -1;
        if(!s1.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            res = s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        return res;
    }


}
