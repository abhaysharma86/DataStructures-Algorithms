package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(10, 9 ,10);
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int i = arr.size() - 1;
        Stack<Integer> st = new Stack<>();
        while (0 <= i) {
            while (!st.isEmpty() && st.peek() <= arr.get(i)) {
                st.pop();
            }

            if (st.isEmpty()) {
                stack.push(-1);
            } else {
                stack.push(st.peek());
            }

            st.push(arr.get(i));
            i--;
        }

        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        System.out.println(res);
    }
}
