package linkedList.singlyLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = first;
        first.next = second;
        second.next = third;
        Node reverse = reverse(head);
        while (reverse != null){
            System.out.println(reverse.data);
            reverse = reverse.next;
        }
    }


    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

}
