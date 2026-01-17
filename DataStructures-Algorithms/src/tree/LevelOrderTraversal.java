package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        System.out.println(levelOrderTrav(root, new ArrayList<>()));
    }

    public static ArrayList<Integer> levelOrderTrav(Node root,  ArrayList<Integer> list){
        Queue<Node> nodes = new LinkedList<>();
        if(root == null){
            return list;
        }
        nodes.add(root);

        while (!nodes.isEmpty())
        {
            Node p =nodes.poll();
            list.add(p.data);
            if(p.left != null){
                nodes.add(p.left);
            }

            if(p.right != null){
                nodes.add(p.right);
            }
        }
        return list;
    }

}
