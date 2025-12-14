package stack;

import java.util.Stack;

public class ParenthesisChecker {

    public static boolean isBalanced(String s) {
        Stack<Character> charItems = new Stack<>();

        int charSize = s.length();
        int i = 0;
        while(i < charSize){
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                charItems.push(c);
                ++i;
            }else{
                if(charItems.isEmpty()){
                    return false;
                }

                if(charItems.peek() == '[' && c == ']' || charItems.peek() == '{' && c == '}' || charItems.peek() == '(' && c == ')'){
                    charItems.pop();
                    ++i;
                }else{
                    return false;
                }
            }
        }

        if(!charItems.isEmpty()){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "[()()]{}";
        System.out.println(isBalanced(s));
    }

}
