package linkedList;


import java.math.BigInteger;
import java.util.HashMap;

public class AddNumberLinkedLists {

    public static void main(String[] args) {


        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        Node four = new Node(9);
        Node five = new Node(9);
        Node six = new Node(9);

        first.next = second;
        second.next = third;

        four.next = five;
        five.next = six;

        Node node = addTwoLists(first, four);

        Node h = node;

        while(h != null){
            System.out.println(h.data);
            h = h.next;
        }

    }

    public static Node addTwoLists(Node head1, Node head2) {
        BigInteger r1 = BigInteger.ZERO;
        BigInteger r2 = BigInteger.ZERO;
        Node h1 = head1;
        while(h1 != null){
           r1 = r1.multiply(BigInteger.TEN).add(BigInteger.valueOf(h1.data));
            h1 = h1.next;
        }
        Node h2 = head2;
        while(h2 != null){
            r2 = r2.multiply(BigInteger.TEN).add(BigInteger.valueOf(h2.data));
            h2 = h2.next;
        }
        BigInteger res = r1.add(r2);
        Node head = null;
        while(res.compareTo(BigInteger.ZERO) > 0){
            head = newNode(head,res.mod(BigInteger.TEN).intValue());
            res=res.divide(BigInteger.TEN);
        }
        return head;
    }

    public static Node newNode(Node head, int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
            return head;
        }
        new_node.next = head;
        return new_node;
    }
}
