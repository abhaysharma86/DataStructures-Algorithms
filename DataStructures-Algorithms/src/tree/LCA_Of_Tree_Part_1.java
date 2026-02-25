package tree;

import java.util.ArrayList;

public class LCA_Of_Tree_Part_1 {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.right.left = new Node(70);
        root.right.right.right = new Node(80);

        System.out.println(findPath(root, 60, 80).data);
    }

    public static Node findPath(Node root, int k, int s) {
        if (root == null) {
            return null;
        }
        if (root.data == k || root.data == s) {
            return root;
        }
        Node path = findPath(root.left, k, s);
        Node path1 = findPath(root.right, k, s);
        if (path != null && path1 != null) {
            return root;
        }
        return path == null ? path1 : path;
    }
}
