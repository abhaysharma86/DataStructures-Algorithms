package linkedList;

import java.util.HashMap;
import java.util.Map;

public class SwapKthNodesFromEnds {

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

        Node node = swapKth(first, 1);

        Node h = node;

        while(h != null){
            System.out.println(h.data);
            h = h.next;
        }
    }

    public static Node swapKth(Node head, int k) {
        Map<Integer,Integer> nodeMap =  new HashMap<>();
        int count = getCount(head, nodeMap);
        if(count < k){
            return head;
        }

        int lastIndex = count - k  + 1;
        Node h = head;
        int index = 0;
        int first = -1;
        int last = -1;
        while(h != null){
            ++index;
            if(index == k){
                h.data = nodeMap.get(lastIndex);
                first = nodeMap.get(lastIndex);
            }
            if(index == lastIndex){
                h.data = nodeMap.get(k);
                last = nodeMap.get(k);
            }
            if(first != -1 && last != -1){
                break;
            }
            h = h.next;
        }
        return head;

    }

    public static int getCount(Node head, Map<Integer,Integer> integerMap){
        int count = 0;
        Node h = head;
        while(h != null){
            ++count;
            integerMap.put(count,h.data);
            h = h.next;
        }
        return count;
    }


}
