package tree;

public class Height_BinaryTree {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        System.out.println(height(root));
    }

    public static int height(Node root) {
        return heightNode(root) - 1;
    }

    public static int heightNode(Node root){
        if(root == null){
            return 0;
        }else{
            return Math.max(heightNode(root.left),heightNode(root.right))+1;
        }
    }

}
