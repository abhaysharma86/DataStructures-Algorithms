package string;

import java.util.*;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("aabbccc"));
    }
    public static char nonRepeatingChar(String s) {
        Map<Character,Integer> st = new HashMap<>();
        int s1 = s.length();
        for(int i = 0; i < s1; i++){
            st.put(s.charAt(i),st.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i = 0; i < s1; i++){
            if(st.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }

        return '$';
    }
}
