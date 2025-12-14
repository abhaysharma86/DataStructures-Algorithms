package stack;

public class Two_Stacks_Array {

    int arr[] = null;
    int size_s1 = -1;
    int size_s2 = -1;
    int capcity_s1 = 0;
    int capcity_s2 = 0;

    Two_Stacks_Array() {
        arr = new int[100];
        int s = arr.length / 2;
        capcity_s1 = s;
        capcity_s2 = arr.length;
        size_s1 = -1;
        size_s2 = s - 1;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        ++size_s1;
        if(size_s1 < capcity_s1){
            arr[size_s1] = x;
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        ++size_s2;
        if(size_s2 < capcity_s2){
            arr[size_s2] = x;
        }
    }

    // Function to remove an element from top of the stack1.

    int pop1() {
        if(-1 < size_s1){
            return arr[size_s1--];
        }else{
            return -1;
        }
    }


    // Function to remove an element from top of the stack2.
    int pop2() {
        if(capcity_s1 - 1< size_s2){
            return arr[size_s2--];
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Two_Stacks_Array obj = new Two_Stacks_Array();
        obj.push1(2);
        obj.push1(3);
        obj.push1(4);
        System.out.println(obj.pop2());
        System.out.println(obj.pop2());
        System.out.println(obj.pop2());

    }

}
