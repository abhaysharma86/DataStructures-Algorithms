package tree;

public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
//        root.left.left = new Node(30);
//        root.left.right = new Node(5);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

//        root.left.left.left = new Node(8);
//        root.left.left.right = new Node(9);
        root.right.left.left = new Node(50);
        root.right.right.right = new Node(50);
//        root.right.left.right = new Node(11);

        System.out.println(diameter(root,0)+1);

    }

    public static int diameter(Node root, int max){
        if(root == null){
            return 0;
        }
        return Math.max(max,Math.max(diameter(root.left, max), diameter(root.right, max))+1);
    }
}
