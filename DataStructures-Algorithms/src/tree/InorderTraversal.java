package tree;

import java.util.ArrayList;

public class InorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        System.out.println(inOrder(root));
    }
    public static ArrayList<Integer> inOrder(Node root) {

        return inOrderTrav(root, new ArrayList<>());

    }

    public static ArrayList<Integer> inOrderTrav(Node root, ArrayList<Integer> list){
        if(root != null){
            inOrderTrav(root.left, list);
            list.add(root.data);
            inOrderTrav(root.right, list);
        }

        return list;
    }

}
