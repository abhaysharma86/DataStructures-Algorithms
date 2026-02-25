package tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal_Line_By_Line_3 {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);

        int height = height(root);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<height; i++){
            list.add(levelOrderTrav(root, 0, i, new ArrayList<>()));
        }
        System.out.println(list);
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }

    public static List<Integer> levelOrderTrav(Node root, int level, int k, List<Integer> list){
        if(root == null){
            return list;
        }
        if(level == k){
            list.add(root.data);
            return list;
        }
        levelOrderTrav(root.left, level+1, k, list);
        levelOrderTrav(root.right, level+1, k, list);
        return list;
    }

}
