package linkedList.circularLinkedList;


public class CircularLinkedListInsertAtEndsWithDataReplace {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = head;

        Node node = insertAtEndsWithDataReplace(head, 5);

        Node h = node;
        do {
            System.out.println(h.data);
            h = h.next;
        }
        while (h != node);

    }


    public static Node insertAtEndsWithDataReplace(Node head, int data){

        Node new_node = new Node(data);
        Node t = head;
        new_node.next = t.next;
        t.next = new_node;
        int d = t.data;
        t.data =  t.next.data;
        t.next.data = d;
        return t.next;
    }

}
