package linkedList.singlyLinkedList;

public class LinkedListDemo1 {

    static class Node {
        int date;
        Node next;

        public Node(int date) {
            this.date = date;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(0);
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = first;
        first.next = second;
        second.next = third;

        Node n = head;

        while (n != null) {
            System.out.println(n.date);
            n = n.next;
        }

    }


}
