package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
    }

    public static char getMaxOccuringChar(String s) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        char res = ' ';
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }else{
                map1.put(s.charAt(i), 1);
            }
        }

        for(Map.Entry<Character,Integer> m : map1.entrySet()){
            char cc = m.getKey();
            int vv = m.getValue();

            if(res == ' ' && count == 0 || count < vv){
                res = cc;
                count = vv;
            }else {
                if(count == vv && cc < res){
                    res = cc;
                    count = vv;
                }
            }

        }
        return res;
    }
}
