package string;

import java.util.*;

public class CaseSpecificSortingStrings {
    public static void main(String[] args) {
        System.out.println(caseSort("GEekS"));
    }
    public static String caseSort(String s) {
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();
        int size = s.length();
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper.add(c);
            }else{
                lower.add(c);
            }
        }

        Collections.sort(upper);
        Collections.sort(lower);

        StringBuilder res = new StringBuilder();
        int u = 0, l = 0;

        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                res.append(upper.get(u++));
            }else{
                res.append(lower.get(l++));
            }
        }
        return res.toString();
    }
}
