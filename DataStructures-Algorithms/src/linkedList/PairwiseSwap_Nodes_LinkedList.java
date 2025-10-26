package linkedList;

public class PairwiseSwap_Nodes_LinkedList {
    public static void main(String[] args) {
        Node first = new Node(4);
        Node second = new Node(1);
        Node third = new Node(8);
        Node four = new Node(5);
//        Node five = new Node(27);

        first.next = second;
        second.next = third;
        third.next = four;
//        four.next = five;

        Node node = pairwiseSwap(first);

        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static Node pairwiseSwap(Node head) {
        Node h1 = head;
        while(h1 != null && h1.next != null){
            int d = h1.data;
            h1.data = h1.next.data;
            h1.next.data = d;
            h1 = h1.next.next;
        }
        return head;
    }


}
