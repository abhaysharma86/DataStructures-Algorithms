package stack;

import java.util.Stack;

public class RemovingConsecutiveDuplicates2 {

    public static String removePair(String s) {
        Stack<Character> res = new Stack<>();
        int i = 0;
        while(i < s.length()){
            char cc = s.charAt(i);
            if(!res.isEmpty()){
                char c = res.peek();
                if(c == cc){
                    res.pop();
                }else{
                    res.push(cc);
                }
            }else{
                res.push(cc);
            }
            i++;
        }
        String sr = res.toString();
        String replc = sr.replace(", ","");
        return replc.substring(1, replc.length() - 1);
    }


    public static void main(String[] args) {
        String s = "aaaaaabaabccccccc";
        System.out.println(removePair(s));
    }

}
