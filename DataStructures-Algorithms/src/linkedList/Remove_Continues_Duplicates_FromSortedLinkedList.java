package linkedList;

import java.util.ArrayList;
import java.util.List;

public class Remove_Continues_Duplicates_FromSortedLinkedList {
    public static void main(String[] args) {
        Node first = new Node(25);
        Node second = new Node(25);
        Node third = new Node(35);
        Node four = new Node(21);
        Node five = new Node(23);

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
        if(head == null || head.next == null){
            return head;
        }

        Node h = head;
        Node prev = h;
        h = h.next;

        while(h != null){

            if(prev.data == h.data ){
                prev.next = h.next;
            }else{
                prev = h;
            }
            h = h.next;
        }

        return head;
    }
}
