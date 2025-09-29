package linkedList.doublyLinkedList;

public class DoublyLinkedListDemo {

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

        Node h = head;
        while (h != null){
            System.out.println(h.data);
            h = h.next;
        }
    }

}
