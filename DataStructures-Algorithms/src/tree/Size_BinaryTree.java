package tree;

public class Size_BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        System.out.println(sizeOfBinaryTree(root));
    }

    public static int sizeOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }
        return  (sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right)) + 1;
    }
}
