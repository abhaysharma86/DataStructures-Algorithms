package string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Nth_NumberMadePrimeDigits {
    public static void main(String[] args) {
        System.out.println(primeDigits(10));
    }

    public static int primeDigits(int n) {

        List<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("2");
        q.add("3");
        q.add("5");
        q.add("7");

        while(list.size() < n){
            String s = q.poll();
            list.add(s);
            q.add(s + "2");
            q.add(s + "3");
            q.add(s + "5");
            q.add(s + "7");
        }

        return  Integer.parseInt(list.getLast());

    }
}
