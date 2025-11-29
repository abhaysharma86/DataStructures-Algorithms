package stack;

import java.util.Stack;

public class OperationsOnStack {

    void insert(Stack<Integer> s, int x) {
        s.push(x);
    }

    // Function to remove top element from stack.
    void remove(Stack<Integer> s) {
        if(!s.isEmpty()){
            s.pop();
        }
    }

    // Function to print the top element of stack.

    void headOf_Stack(Stack<Integer> s) {
        if(!s.isEmpty()){
            System.out.println(s.peek());
        }
    }


    // Function to search an element in the stack.
    boolean find(Stack<Integer> s, int val) {
        Stack<Integer> temp = new Stack<>();
        boolean found = false;
        while(!s.isEmpty()){
            int t =  s.pop();
            temp.push(t);
            if(t == val){
                found = true;
                break;
            }
        }

        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return found;
    }
}
