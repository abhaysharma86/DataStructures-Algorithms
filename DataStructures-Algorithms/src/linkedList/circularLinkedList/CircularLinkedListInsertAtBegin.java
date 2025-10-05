package linkedList.circularLinkedList;


public class CircularLinkedListInsertAtBegin {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = head;

        Node node = insertAtBegin(head, 0);

        Node h = node;
        do {
            System.out.println(h.data);
            h = h.next;
        }
        while (h != node);

    }


    public static Node insertAtBegin(Node head, int data){

        Node new_node = new Node(data);

        Node t = head;
        do{
         t = t.next;
        }while (t.next != head);

        new_node.next = head;
        t.next = new_node;

        return new_node;
    }

}
