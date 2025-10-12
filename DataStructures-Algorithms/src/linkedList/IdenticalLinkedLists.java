package linkedList;

public class IdenticalLinkedLists {
    public static void main(String[] args) {
        Node first = new Node(26);
        Node second = new Node(25);
        Node third = new Node(35);
        Node four = new Node(21);
        Node five = new Node(21);

        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;

        Node first1 = new Node(25);
        Node second1 = new Node(25);
        Node third1 = new Node(35);
        Node four1 = new Node(21);
        Node five1 = new Node(21);

        first1.next = second1;
        second1.next = third1;
        third1.next = four1;
        four1.next = five1;

        boolean b = areIdentical(first, first1);
        System.out.println(b);
    }

    public static boolean areIdentical(Node head1, Node head2) {
        Node h1 = head1;
        Node h2 = head2;
        int count1 = 0;
        int count2 = 0;

        while(h1 != null || h2 != null){
            if(h1 != null && h2 != null && h1.data != h2.data){
                return false;
            }
            if(h1 != null){
                ++count1;
                h1 = h1.next;
            }
            if(h2 != null){
                ++count2;
                h2 = h2.next;
            }
        }
        if(count1 != count2){
            return false;
        }
        return true;
    }
}
