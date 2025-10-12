package linkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveLoopLinkedList {
    public static void main(String[] args) {
        Node first = new Node(25);
        Node second = new Node(15);
        Node third = new Node(35);
        Node four = new Node(26);
        Node five = new Node(27);

        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        five.next = first;


        removeLoop(first);
        Node h = first;

        while(h != null){
            System.out.println(h.data);
            h = h.next;
        }
    }

    public static void removeLoop(Node head) {
        Set<Node> setNode = new HashSet<>();
        Node h = head;
        while(h.next != null){
            if(setNode.contains(h.next)){
                h.next = null;
                break;
            }
            setNode.add(h);
            h = h.next;
        }
    }
}
