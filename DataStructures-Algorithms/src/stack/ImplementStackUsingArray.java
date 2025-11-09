package stack;

public class ImplementStackUsingArray {
    int top;
    int capicity;
    int stack[];
    public ImplementStackUsingArray(int n) {
        stack = new int[n];
        capicity = n;
        top = -1;
    }

    public boolean isEmpty() {
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull() {

        return top == capicity -1;
    }

    public void push(int x) {
        if(!isFull()){
            stack[++top] = x;
        }

    }

    public void pop() {
        if(!isEmpty()){
            top--;
        }
    }

    public int peek() {
        if(!isEmpty()){
            return stack[top];
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementStackUsingArray obj = new ImplementStackUsingArray(3);
        obj.push(5);
        obj.push(3);
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.isEmpty());
        System.out.println(obj.isFull());
    }
}
