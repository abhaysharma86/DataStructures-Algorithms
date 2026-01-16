package string;

import java.util.HashSet;
import java.util.Set;

public class Remove_Common_Characters_Concatenate {
    public static void main(String[] args) {
        System.out.println(concatenatedString("abc","abcfc"));
    }
    public static String concatenatedString(String s1, String s2) {

        Set<Character> st1 = new HashSet<>();
        Set<Character> st2 = new HashSet<>();

        int si = s1.length();
        int sj = s2.length();
        int maxs = Math.max(si,sj);
        for(int i = 0; i < maxs; i++){
            if(i < si){
                st1.add(s1.charAt(i));
            }
            if(i < sj){
                st2.add(s2.charAt(i));
            }
        }

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int i = 0; i < maxs; i++){
            if(i < si && !st2.contains(s1.charAt(i))){
                str1.append(s1.charAt(i));
            }
            if(i < sj && !st1.contains(s2.charAt(i))){
                str2.append(s2.charAt(i));
            }
        }

        if(str1.isEmpty() && str2.isEmpty()){
            return "-1";
        }

        str1.append(str2);

        return str1.toString();

    }
}
