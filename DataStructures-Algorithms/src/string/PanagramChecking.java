package string;

import java.util.ArrayList;
import java.util.List;

public class PanagramChecking {
    public static void main(String[] args) {
        System.out.println(checkPangram("In the given string, there aren't all the letters present in the English alphabet. Hence, the output is false"));
    }
    public static boolean checkPangram(String s) {
        List<Character> list = new ArrayList<>();

        int si = s.length();

        int max = 27;

        if(si < max){
            return false;
        }

        for(int i = 0; i < si; i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(Character.isLetter(c) && !list.contains(c)){
                list.add(c);
            }
        }

        return list.size() == max - 1 ? true : false;
    }
}
