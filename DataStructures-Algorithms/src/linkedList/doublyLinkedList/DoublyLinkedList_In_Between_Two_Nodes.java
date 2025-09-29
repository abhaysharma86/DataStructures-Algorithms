package linkedList.doublyLinkedList;

public class DoublyLinkedList_In_Between_Two_Nodes {

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
        Node insertion = insertionBetweenTwoNodes(head, 0, size(head)/2);
        Node h = insertion;
        while (h != null){
            System.out.println(h.data);
            h = h.next;
        }
    }

    public static int size(Node head){
        Node h = head;
        int count = 0;
        while (h != null){
            count++;
            h = h.next;
        }
        return count;
    }

    public static Node insertionBetweenTwoNodes(Node head, int k, int size){
        Node new_node = new Node(k);

        Node n = head;
        int count = 1;
        while (n != null && size != count){
            count++;
            n = n.next;
        }

        new_node.next = n.next;
        n.next.prev = new_node;
        n.next = new_node;
        new_node.prev = n;
        return head;
    }

}
