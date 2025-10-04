package linkedList.doublyLinkedList;

public class ReverseDoublyLinkedList {

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

        Node reverse = reverse(head);

        Node h = reverse;
        while (h != null) {
            System.out.println(h.data);
            h = h.next;
        }
    }

    public static Node reverse(Node head) {

        Node curr = head;
        Node temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        head = temp.prev;
        return head;
    }

}
