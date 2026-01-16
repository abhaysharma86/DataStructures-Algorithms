package tree;

import java.util.ArrayList;

public class Print_Nodes_K_Distance {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        System.out.println(printKthNode(root,2,new ArrayList<>()));
    }

    public static ArrayList<Integer> printKthNode(Node root, int k , ArrayList<Integer> list){
        if(root == null){
            return list;
        }else {
            if(k == 0){
                list.add(root.data);
                return list;
            }
            printKthNode(root.left, k-1, list);
            printKthNode(root.right, k-1, list);
        }
        return list;
    }

}
