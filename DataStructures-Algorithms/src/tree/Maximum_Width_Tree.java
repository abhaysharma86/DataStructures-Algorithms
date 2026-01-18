package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Maximum_Width_Tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        System.out.println(maxWidth(root));
    }
   static int maxWidth(Node root) {
        Queue<Node> q = new LinkedList<>();
        int max = 0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node n = q.poll();
                if(n.left != null){
                    q.add(n.left);
                }

                if(n.right != null){
                    q.add(n.right);
                }
            }
            max = Math.max(size,max);
        }
        return max;
    }
}
