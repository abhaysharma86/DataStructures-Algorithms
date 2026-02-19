package array;

import java.util.ArrayList;
import java.util.List;

public class CheckEqualsNoVowels {
    public static void main(String[] args) {
        String str = "xXfmKYQLAbTArGwjAJ";
        System.out.println(CheckEqualsNoVowels.test(str));
    }

    static boolean test(String str){
        String s1 = str.substring(0,str.length()/2);
        String s2 = str.substring(str.length()/2);
        List<Character> v = new ArrayList<>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        v.add('A');
        v.add('E');
        v.add('I');
        v.add('O');
        v.add('U');


       // A,E,I,O,U

        int c1 = 0,c2 = 0;
        for(int i =0; i < s1.length(); i++){
            if(v.contains(s1.charAt(i))){
                c1++;
            }
            if(v.contains(s2.charAt(i))){
                c2++;
            }
        }

        if(c1 != c2){
            return false;
        }
        return true;
    }
}
