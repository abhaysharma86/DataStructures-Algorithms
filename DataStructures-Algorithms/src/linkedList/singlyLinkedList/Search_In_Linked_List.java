package linkedList.singlyLinkedList;


class Node {
    int data;
    Node next;

    public Node(int date) {
        this.data = date;
        this.next = null;
    }
}

public class Search_In_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = first;
        first.next = second;
        second.next = third;
        print(head);
        System.out.println("Position : "+ search(2,head));
    }


    public static int search(int k, Node head) {

        int index = -1;
        Node n = head;
        while (n != null) {
            index++;
            if (n.data == k) {
                return index;
            }
            n = n.next;
        }
        return -1;
    }

    public static void print(Node head) {

        if (head == null) {
            return;
        }
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
