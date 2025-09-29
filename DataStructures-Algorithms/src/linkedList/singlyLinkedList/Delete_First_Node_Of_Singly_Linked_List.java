package linkedList.singlyLinkedList;

public class Delete_First_Node_Of_Singly_Linked_List {

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
        head = removeFirstNode(head);
        Node n = head;
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static Node removeFirstNode(Node head) {
        head = head.next;
        return head;
    }
}
