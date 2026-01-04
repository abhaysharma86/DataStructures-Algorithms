package string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(areIsomorphic("abc","xxz"));
    }
    public static boolean areIsomorphic(String s1, String s2) {
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> map1 = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            if(map.isEmpty()){
                map.put(s1.charAt(i), s2.charAt(i));
                map1.put(s2.charAt(i), s1.charAt(i));
            }else{
                if(map.containsKey(s1.charAt(i))){
                    char c = map.get(s1.charAt(i));
                    if(c != s2.charAt(i))
                    {
                        return false;
                    }
                } else if (map1.containsKey(s2.charAt(i))) {
                    char ch = map1.get(s2.charAt(i));
                    if(ch != s1.charAt(i)){
                        return false;
                    }
                } else{
                    map.put(s1.charAt(i), s2.charAt(i));
                    map1.put(s2.charAt(i), s1.charAt(i));
                }
            }
        }
        return true;
    }
}
