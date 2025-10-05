package linkedList.doublyLinkedList;

public class DoublyLinkedListInsertion_At_X_Position {

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
        Node insertion = insertionBetweenTwoNodes(head, 44, 3);
        Node h = insertion;
        while (h != null) {
            System.out.println(h.data);
            h = h.next;
        }
    }

    public static Node insertionBetweenTwoNodes(Node head, int x, int p) {
        Node new_node = new Node(x);
        Node n = head;
        int count = 0;
        while (n != null && p != count) {
            ++count;
            n = n.next;
        }
        if (p == count && n.next != null) {
            new_node.next = n.next;
            n.next.prev = new_node;
            n.next = new_node;
            new_node.prev = n;
        } else {
            if (n.next == null){
                n.next = new_node;
                new_node.prev = n;
            }
        }
        return head;
    }

}
