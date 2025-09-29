package linkedList.singlyLinkedList;

public class Recursive_Traversal_Of_Singly_Linked_List {

    static class Node {
        int data;
        Node next;

        public Node(int date) {
            this.data = date;
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
        traverse(head);
    }

    public static void traverse(Node head){

        if(head == null){
            return;
        }
        traverse(head.next);
        System.out.println(head.data);
    }
}
