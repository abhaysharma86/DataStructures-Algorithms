package tree;

import java.util.Stack;

public class TreeTraversalSpiralForm {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.right.left.left = new Node(10);
        root.right.left.right = new Node(11);

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){

            while(!s1.isEmpty()){
                Node pop = s1.pop();
                System.out.print(pop.data +", ");
                if(pop.left != null)
                    s2.push(pop.left);
                if(pop.right != null)
                    s2.push(pop.right);
            }

            while(!s2.isEmpty()){
                Node pop1 = s2.pop();
                System.out.print(pop1.data+", ");
                if(pop1.right != null){
                    s1.push(pop1.right);
                }
                if(pop1.left != null){
                    s1.push(pop1.left);
                }
            }
        }


    }
}
