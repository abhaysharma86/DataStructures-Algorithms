package linkedList.circularLinkedList;


public class CircularLinkedListDeletingHead {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = head;

        Node node = insertAtBegin(head);

        Node h = node;
        do {
            System.out.println(h.data);
            h = h.next;
        }
        while (h != node);

    }


    public static Node insertAtBegin(Node head){
        Node t = head;


        while (t.next.next != head){
            t = t.next;
        }
        t.next = t.next.next;

        return t.next;
    }

}
