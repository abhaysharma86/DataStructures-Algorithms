package string;

import java.util.HashMap;
import java.util.Map;

public class MinimumIndexedCharacter {
    public static void main(String[] args) {
        System.out.println(minIndexChar("adcffaet","onkl"));
    }
    public static int minIndexChar(String s1, String s2) {
        Map<Character,Integer> m1 = new HashMap<>();

        int si = s1.length();
        int sj = s2.length();
        int ind = si+1;
        for(int i = 0; i < si; i++){
            if(m1.containsKey(s1.charAt(i))){
                continue;
            }
            m1.put(s1.charAt(i), i);
        }

        for(int i = 0; i < sj; i++){

            if(m1.containsKey(s2.charAt(i)) && m1.get(s2.charAt(i)) < ind){
                ind = m1.get(s2.charAt(i));
            }

        }
        return ind < si+1 ? ind : -1;
    }
}
