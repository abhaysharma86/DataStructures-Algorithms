package linkedList.doublyLinkedList;

public class DoublyLinkedList_At_The_End_Of_The_DLL {

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
        insertionEndNodes(head, 0);
        Node h = head;
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

    public static Node insertionEndNodes(Node head, int k){
        Node new_node = new Node(k);

        Node n = head;
        while (n != null){
            if(n.next == null){
                n.next =  new_node;
                new_node.prev = n;
                break;
            }
            n = n.next;
        }
        return null;
    }

}
