package linkedList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class FindLengthOfLoop {

    public static void main(String[] args) {


        Node first = new Node(25);
        Node second = new Node(14);
        Node third = new Node(19);
        Node four = new Node(33);
        Node five = new Node(10);

        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
//        five.next = third;
        System.out.println(findLengthOfLoop(first));

    }

    public static int findLengthOfLoop(Node head) {
        int count = 0;
        if (head == null) return 0;

        HashMap<Node, Integer> nodeList = new HashMap<>();
        Node h = head;
        while (h != null) {

            if (nodeList.containsKey(h)) {
                return count - nodeList.get(h) + 1;
            }
            nodeList.put(h, ++count);
            h = h.next;
        }
        return 0;
    }
}
