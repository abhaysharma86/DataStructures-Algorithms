package tree;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversalWithoutRecursion {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(12);
        root.left.left = new Node(13);
        root.left.right = new Node(14);
        root.right = new Node(15);
        root.right.right = new Node(16);
        root.right.right.right = new Node(17);
        System.out.println(inOrder(root));
    }
    public static ArrayList<Integer> inOrder(Node root) {

        return inOrderTrav(root, new ArrayList<>());

    }

    public static ArrayList<Integer> inOrderTrav(Node root, ArrayList<Integer> list){
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
                continue;
            }
            Node temp = stack.pop();
            list.add(temp.data);
            curr = temp.right;
        }
        return list;
    }

}
