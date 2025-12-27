package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

    public static void main(String[] args) {

        QueueUsingLinkedList list = new QueueUsingLinkedList();

        System.out.println(list.getFront());
        System.out.println(list.size());
        list.enqueue(7);
        list.enqueue(0);
        list.enqueue(14);
        list.dequeue();
        System.out.println(list.getFront());


    }

    Node head = null;
    int size = 0;
    public QueueUsingLinkedList() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int x) {
        Node temp = new Node(x);
        if(head == null){
            head = temp;
            size++;
        }else {
            Node t = head;
            while (t.next != null){
                t = t.next;
            }
            t.next = temp;
            size++;
        }
    }

    public void dequeue() {
        if(!isEmpty()){
            Node temp = head.next;
            head = temp;
            --size;
        }
    }

    public int getFront() {
        if(!isEmpty()){
            return head.data;
        }
        return -1;
    }

    public int size() {
        return size;
    }

}


class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}