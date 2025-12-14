package stack;

import java.util.Stack;

public class RemovingConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String s) {
        Stack<Character> res = new Stack<>();
        int i = 0;

        while(i < s.length()){
            char cc = s.charAt(i);
            if(res.isEmpty() || !res.isEmpty() && res.peek() != cc){
                res.push(cc);
            }
            i++;
        }

        String sr = res.toString();
        String rep = sr.replace(", ","");
        return rep.substring(1, rep.length() - 1);
    }

    public static void main(String[] args) {
        String s = "abbccbcd";
        System.out.println(removeConsecutiveDuplicates(s));
    }
}
