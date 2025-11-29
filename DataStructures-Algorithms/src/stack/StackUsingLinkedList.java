package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackUsingLinkedList {

    int size;
    Node leaf;
    Node head;

    public StackUsingLinkedList() {
        size = 0;
        head = null;
        leaf = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int x) {
        Node h = new Node(x);
        if(isEmpty()){
            head = h;
            leaf = head;
        }else{
            leaf.next = h;
            leaf = h;
        }
        ++size;
    }

    public void pop() {
        if(isEmpty()){
            return;
        }

        Node h = head;

        if(head.next == null){
            head = null;
            --size;
            leaf = head;
            return;
        }

        while(h != null){
            if(h.next.next == null){
                h.next = null;
                leaf = h;
            }
            h = h.next;
        }

        --size;
    }

    public int peek() {
        if(!isEmpty() && leaf != null){
            return leaf.data;
        }
        return-1;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        StackUsingLinkedList obj = new StackUsingLinkedList();
        System.out.println(obj.size());
        obj.push(6);
        obj.push(5);
        System.out.println(obj.size());
        obj.pop();
        System.out.println(obj.peek());
    }

}
