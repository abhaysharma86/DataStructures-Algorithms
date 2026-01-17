package tree;

public class MaximumBinaryTree {
    public static void main(String[] args) {
        int[] arr = {20, 80, 30, 40, 50};

        Node root = null;
        for (int x : arr) {
            root = Main.insert(root, x);
        }
        System.out.println(maxNumberBinary(root));
    }

    public static int  maxNumberBinary(Node root){
        if(root == null){
            return 0;
        }else {
          return Math.max(root.data,Math.max(maxNumberBinary(root.left),maxNumberBinary(root.right)));
        }
    }
}
