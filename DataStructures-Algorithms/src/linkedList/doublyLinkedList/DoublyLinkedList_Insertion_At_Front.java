package linkedList.doublyLinkedList;

public class DoublyLinkedList_Insertion_At_Front {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        head.next = first;
        first.prev = head;

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;
        Node insertion = insertion(head, 0);
        Node h = insertion;
        while (h != null){
            System.out.println(h.data);
            h = h.next;
        }
    }

    public static Node insertion(Node head, int k){
        Node new_node = new Node(k);
        new_node.next = head;
        head.prev = new_node;
         head = new_node;
        return head;
    }

}
