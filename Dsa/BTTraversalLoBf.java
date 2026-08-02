package Dsa;
//binary tree, level order traversal, breadth first traversal


import java.util.LinkedList;
import java.util.Queue;

public class BTTraversalLoBf {
    private static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int tmp) {
            data = tmp;
        }
    }
    public void levelOrderTraversal(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node curr = queue.remove();
            System.out.print(curr.data + " ");
            if (curr.left != null){
                queue.add(curr.left);
            }
            if (curr.right != null){
                queue.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        BTTraversalLoBf lot = new BTTraversalLoBf();
        root = new Node(34);
        root.left = new Node(56);
        root.right = new Node(67);
        root.left.left = new Node(90);
        root.left.right = new Node(63);
        root.right.left = new Node(890);
        root.right.right = new Node(543);
        lot.levelOrderTraversal();

    }
}
