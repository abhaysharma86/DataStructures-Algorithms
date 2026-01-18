package tree;

public class CheckBalancedBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(12);
        root.left.left = new Node(13);
        root.left.right = new Node(14);
        root.right = new Node(15);
        root.right.right = new Node(16);
        root.right.right.right = new Node(16);
        System.out.println(checkTreeBal(root));
    }
    public static int checkTreeBal(Node root){
        if(root == null){
            return 0;
        }
        int s = checkTreeBal(root.left);
        int s1 = checkTreeBal(root.right);
        return (Math.abs(s-s1) > 1) ? -1 : Math.max(s,s1)+1;
    }
}
