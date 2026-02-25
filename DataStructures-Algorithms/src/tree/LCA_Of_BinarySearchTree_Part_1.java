package tree;

import java.util.ArrayList;

public class LCA_Of_BinarySearchTree_Part_1 {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.right.left = new Node(70);
        root.right.right.right = new Node(80);

        ArrayList<Integer> path = findPath(root, 20);
        ArrayList<Integer> path1 = findPath(root, 80);
        int index = 0;
        for(int i = 0; i < path.size(); i++){
            if(path1.contains(path.get(i))){
                index = i;
            }
        }
        System.out.println(path.get(index));
    }

    public static ArrayList<Integer> findPath(Node root, int k){
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = root;
        while(curr != null){
            list.add(curr.data);
            if(curr.data == k){
                break;
            }
            if(curr.data >= k){
                curr = curr.left;
            }else {
             curr = curr.right;
            }
        }
        return list;
    }
}
