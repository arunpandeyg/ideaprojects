package Dsa;
//binary tree preorder traversal without recursion, push right node first , because stake is fifo.
//preorder -- root->left->right
//inorder -- left ->root-.right
//postorder-- left ->right->root

import java.util.Stack;

public class BTPreOrder {
    Node root;
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int tmp) {
            data = tmp;
        }
    }

    void doPreorder(){
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.print(temp.data + "-->");
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
        }
    }

    public static void main(String[] args) {
        BTPreOrder  tree = new BTPreOrder();
        tree.root = new Node(20);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(15);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(35);
        tree.doPreorder();
    }

}
