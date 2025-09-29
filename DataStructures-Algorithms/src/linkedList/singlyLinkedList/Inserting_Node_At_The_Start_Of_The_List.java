package linkedList.singlyLinkedList;

public class Inserting_Node_At_The_Start_Of_The_List {

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
       head =  push(-1,head);

        Node n = head;
        while (n != null){
            System.out.println(n.date);
            n = n.next;
        }

    }

    public static Node push(int data, Node head){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
        return head;
    }

}
