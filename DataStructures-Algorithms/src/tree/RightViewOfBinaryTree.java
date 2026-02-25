package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(10);
        root.right = new Node(50);
        root.left.right = new Node(20);
        root.right.left = new Node(40);
        root.right.right = new Node(60);

        System.out.println(rightView(root));
    }
    public static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node t = q.poll();
                if(i == 0){
                    list.add(t.data);
                }
                if(t.right != null){
                    q.add(t.right);
                }
                if(t.left != null){
                    q.add(t.left);
                }
            }

        }

        return list;
    }
}
