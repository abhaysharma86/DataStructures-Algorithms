package tree;

import java.util.ArrayList;

public class PreorderTraversal {
    public static void main(String[] args) {

        // 1, 4, N, 4, 2

        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        System.out.println(preOrder(root));
    }
    public static ArrayList<Integer> preOrder(Node root) {
        return preOrderTrav(root, new ArrayList<>());
    }

    public static ArrayList<Integer> preOrderTrav(Node root, ArrayList<Integer> list){

        if(root != null){
            list.add(root.data);
            preOrderTrav(root.left, list);
            preOrderTrav(root.right, list);
        }
        return list;
    }
}

