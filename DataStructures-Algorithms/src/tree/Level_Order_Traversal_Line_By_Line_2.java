package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal_Line_By_Line_2 {
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
        ArrayList<Integer> list = null;
        if(root == null){
            return arrayLists;
        }
        nodes.add(root);
        while (!nodes.isEmpty())
        {
            list =  new ArrayList<>();
            int count = nodes.size();

            for(int i =0; i < count; i++){
                Node p = nodes.poll();
                list.add(p.data);
                if(p.left != null){
                    nodes.add(p.left);
                }

                if(p.right != null){
                    nodes.add(p.right);
                }
            }
            arrayLists.add(list);
        }

        return arrayLists;
    }
}
