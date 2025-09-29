package linkedList.singlyLinkedList;

public class Insert_At_Given_Position_Singly_Linked_List {

    static class Node {
        int data;
        Node next;

        public Node(int date) {
            this.data = date;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = first;
        first.next = second;
        second.next = third;
        head = addAtIndex(5, head,5);
        Node n = head;
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static Node addAtIndex(int index, Node head, int new_data) {

        Node new_node = new Node(new_data);

        int count = 0;
        Node n = head;
        while (n != null) {
            if (index - 1 == count) {
                new_node.next = n.next;
                n.next = new_node;
//                break;
            }
            n = n.next;
            count++;
        }

        if(count < index){
            System.out.println("Index position is greater then list");
        }
        return head;
    }
}
