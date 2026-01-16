package string;

import java.util.HashMap;
import java.util.Map;

public class KeypadTyping {
    public static void main(String[] args) {
        System.out.println(printNumber("geeksforgeeks"));
    }
    public static String printNumber(String s) {
        Map<Character,Integer> m1 = new HashMap<>();

        m1.put('a',2);
        m1.put('b',2);
        m1.put('c',2);

        m1.put('d',3);
        m1.put('e',3);
        m1.put('f',3);

        m1.put('g',4);
        m1.put('h',4);
        m1.put('i',4);

        m1.put('j',5);
        m1.put('k',5);
        m1.put('l',5);

        m1.put('m',6);
        m1.put('n',6);
        m1.put('o',6);

        m1.put('p',7);
        m1.put('q',7);
        m1.put('r',7);
        m1.put('s',7);

        m1.put('t',8);
        m1.put('u',8);
        m1.put('v',8);


        m1.put('w',9);
        m1.put('x',9);
        m1.put('y',9);
        m1.put('z',9);
        String res = "";
        for(int i = 0; i < s.length(); i++){
            res+=m1.get(s.charAt(i));
        }

        return res;


    }
}

