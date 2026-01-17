package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintLeftViewBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(10);
        root.right = new Node(50);
        root.left.right = new Node(20);
        root.right.left = new Node(40);
        root.right.right = new Node(60);

        System.out.println(treeLeftView(root));
    }

    public static ArrayList<Integer> treeLeftView(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
        while(!queue.isEmpty()){
            Node p = queue.poll();
            if(p.left != null) {
                list.add(p.left.data);
                queue.add(p.left);
            }
            if(p.right != null)
                queue.add(p.right);

        }
        return list;
    }
}
