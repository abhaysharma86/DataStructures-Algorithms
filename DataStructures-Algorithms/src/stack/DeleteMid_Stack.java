package stack;

import java.util.Stack;

public class DeleteMid_Stack {

    public void deleteMid(Stack<Integer> s) {
        double d = (s.size() + 1) / 2.0;
        int size = (int) Math.ceil(d);
        deleteMi(s, size, 1);
    }

    public void deleteMi(Stack<Integer> s, int k, int i){
        if(i == k){
            s.pop();
            return;
        }
        int it = s.pop();
        deleteMi(s, k, ++i);
        s.push(it);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        DeleteMid_Stack obj =  new DeleteMid_Stack();
        obj.deleteMid(stack);
        System.out.println(stack);


    }
}
