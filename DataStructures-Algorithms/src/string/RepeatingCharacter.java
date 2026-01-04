package string;

import java.util.*;

public class RepeatingCharacter {
    public static void main(String[] args) {

        System.out.println(repeatedCharacter("RbDsCLK"));
    }
    public static int repeatedCharacter(String S) {
        Map<Character,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int s1 = S.length();

        for(int i = 0; i < s1; i++){
            if(map.containsKey(S.charAt(i))){
                if(!list.contains(map.get(S.charAt(i)))){
                    list.add(map.get(S.charAt(i)));
                }
            }else{
                map.put(S.charAt(i),i);
            }
        }
        if(list.isEmpty()){
            return -1;
        }
        Collections.sort(list);
        return list.getFirst();
    }
}
