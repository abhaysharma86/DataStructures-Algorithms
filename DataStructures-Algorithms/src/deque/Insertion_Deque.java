package deque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Insertion_Deque {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(dqInsertion(list));
    }

    public static Deque<Integer> dqInsertion(List<Integer> arr) {
        Deque<Integer> integers = new LinkedList<>();
        integers.addAll(arr);
        return integers;
    }
}
