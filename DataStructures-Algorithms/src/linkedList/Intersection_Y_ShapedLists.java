package linkedList;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Y_ShapedLists {

    public static void main(String[] args) {
        Node first = new Node(4);
        Node second = new Node(1);
        Node third = new Node(8);
        Node four = new Node(5);
//        Node five = new Node(27);

        first.next = second;
        second.next = third;
        third.next = four;
//        four.next = five;

        Node first1 = new Node(5);
        Node second1 = new Node(6);
        Node third1 = new Node(1);
        Node four1 = new Node(8);
        Node five1 = new Node(5);

        first1.next = second1;
        second1.next = third1;
        third1.next = four1;
        four1.next = five1;

        Node node = intersectPoint(first, first1);
        Node h2 = node;
        while (h2 != null) {
            System.out.println(h2.data);
            h2 = h2.next;
        }

    }

    public static Node intersectPoint(Node head1, Node head2) {
        Node h1 = head1;
        boolean flag = true;
        while (h1 != null) {
            Node h2 = head2;
            while (h2 != null) {
                if (h1.data == h2.data) {
                    Node h11 = h1;
                    Node h22 = h2;
                    while (h11 != null && h22 != null) {
                        if (h11.data != h22.data) {
                            flag = false;
                        }
                        h22 = h22.next;
                        h11 = h11.next;
                    }
                    if (flag)
                        return h2;
                }
                h2 = h2.next;
            }
            h1 = h1.next;
        }
        return null;
    }
}
