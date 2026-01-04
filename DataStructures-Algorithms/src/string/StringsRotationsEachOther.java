package string;

import java.util.HashMap;
import java.util.Map;

public class StringsRotationsEachOther {
    public static void main(String[] args) {
        System.out.println(areRotations( "geeksforgeeks","forgeeksgeeks"));
    }

    public static boolean areRotations(String s1, String s2) {

        if(s1.equals(s2)){
            return true;
        }
        int i = 0;
        int j = s1.length() - 1;
        while(i < j){
            String c = s1.charAt(j)+"";
             s1 = c + "" + s1.substring(0,j);
            if(s1.equals(s2)){
                return true;
            }
            ++i;
        }
        return false;
    }
}
