package linkedList;

public class DeleteWithoutHeadPointer {
    public static void main(String[] args) {
        Node first = new Node(25);
        Node second = new Node(14);
        Node third = new Node(19);
        Node four = new Node(33);
        Node five = new Node(10);

        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;

        deleteNode(four);
        Node h = first;

        while(h != null){
            System.out.println(h.data);
            h = h.next;
        }
    }

    public static void deleteNode(Node del_node) {

        if(del_node == null || del_node.next == null){
            return;
        }

        Node h = del_node;
        int temp = h.data;
        h.data = h.next.data;
        h.next.data = temp;
        h.next = h.next.next;
    }
}
