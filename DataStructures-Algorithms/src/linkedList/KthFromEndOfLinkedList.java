package linkedList;

import java.util.ArrayList;
import java.util.List;

public class KthFromEndOfLinkedList {
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

        int kthFromLast = getKthFromLast(first, 6);
        System.out.println(kthFromLast);
    }

    static int getKthFromLast(Node head, int k) {
        Node newHead = reverse(head);

        int count = 0;
        Node h = newHead;

        while (h != null) {
            ++count;
            if (count == k) {
                return h.data;
            }
            h = h.next;
        }

        return -1;

    }

    public static Node reverse(Node head) {
        Node h = head;
        Node prev = null;
        Node next = h;
        while (h != null) {
            next = h.next;
            h.next = prev;
            prev = h;
            h = next;
        }
        return prev;
    }
}
