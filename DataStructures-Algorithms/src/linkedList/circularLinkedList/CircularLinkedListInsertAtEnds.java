package linkedList.circularLinkedList;


public class CircularLinkedListInsertAtEnds {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = head;

        Node node = insertAtEnds(head, 5);

        Node h = node;
        do {
            System.out.println(h.data);
            h = h.next;
        }
        while (h != node);

    }


    public static Node insertAtEnds(Node head, int data){

        Node new_node = new Node(data);

        Node t = head;
        do{
         t = t.next;
        }while (t.next != head);

        t.next = new_node;
        new_node.next = head;

        return head;
    }

}
