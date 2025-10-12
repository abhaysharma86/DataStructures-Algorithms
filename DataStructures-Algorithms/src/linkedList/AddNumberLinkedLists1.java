package linkedList;


import java.math.BigInteger;

public class AddNumberLinkedLists1 {

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

        Node rev1 =  reverse(head1);
        Node rev2 =  reverse(head2);

        Node res = null;
        int carry = 0;

        while(rev1 != null || rev2 != null){
            int d1 = carry;

            if(rev1 != null){
                d1+= rev1.data;
                rev1 = rev1.next;
            }
            if(rev2 != null){
                d1+= rev2.data;
                rev2 = rev2.next;
            }
            carry = d1 / 10;
            res = addNewNode(res, d1 % 10);
        }
        if(carry != 0)
           res = addNewNode(res, carry);

        res = removeZeros(res);
        return res;
    }

    public static Node addNewNode(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        return newNode;
    }


    public static Node removeZeros(Node head){
        Node h = head;
        while(h != null && h.data == 0){
            h = h.next;
        }
        return h;
    }


    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next = curr;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
