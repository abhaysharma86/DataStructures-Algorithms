package string;

import java.util.HashMap;
import java.util.Map;

public class Check_StringIsogram_Not {
    public static void main(String[] args) {
        System.out.println(isIsogram("geeks"));
    }
    static boolean isIsogram(String data) {
        Map<Character,Integer> map = new HashMap<>();
        int size = data.length();
        for(int i = 0; i < size; i++){
            if(map.containsKey(data.charAt(i))){
                return false;
            }else{
                map.put(data.charAt(i),1);
            }
        }
        return true;
    }
}
