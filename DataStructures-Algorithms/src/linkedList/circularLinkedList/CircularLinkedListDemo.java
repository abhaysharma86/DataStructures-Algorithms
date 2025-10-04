package linkedList.circularLinkedList;


public class CircularLinkedListDemo {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = head;


        Node h = head;
        do {
            System.out.println(h.data);
            h = h.next;
        }
        while (h != head);
    }




}
