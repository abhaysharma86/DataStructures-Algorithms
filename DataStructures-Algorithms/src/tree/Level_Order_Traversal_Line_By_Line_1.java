package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal_Line_By_Line_1 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        System.out.println(levelOrderTrav(root));
    }

    public static ArrayList<ArrayList<Integer>> levelOrderTrav(Node root){
        Queue<Node> nodes = new LinkedList<>();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return arrayLists;
        }
        nodes.add(root);
        nodes.add(null);

        while (nodes.size() > 1)
        {
            Node p =nodes.poll();
            if(p == null){
                arrayLists.add(list);
                nodes.add(null);
               list = new ArrayList<>();
                continue;
            }
            list.add(p.data);
            if(p.left != null){
                nodes.add(p.left);
            }

            if(p.right != null){
                nodes.add(p.right);
            }
        }
        arrayLists.add(list);
        return arrayLists;
    }
}
