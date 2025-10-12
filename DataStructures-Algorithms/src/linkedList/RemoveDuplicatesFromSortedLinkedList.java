package linkedList;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedLinkedList {
    public static void main(String[] args) {
        Node first = new Node(25);
        Node second = new Node(15);
        Node third = new Node(35);
        Node four = new Node(25);
        Node five = new Node(25);

        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;

        removeDuplicates(first);
        Node h = first;

        while(h != null){
            System.out.println(h.data);
            h = h.next;
        }
    }

    public static Node removeDuplicates(Node head) {
        List<Integer> list = new ArrayList<>();
        Node h = head;
        Node prev = h;
        while(h != null){
            int data = h.data;

            if(list.contains(data)){
                prev.next = h.next;
                h = h.next;
                continue;
            }
            prev = h;
            h = h.next;
            list.add(data);
        }

        return head;
    }
}
