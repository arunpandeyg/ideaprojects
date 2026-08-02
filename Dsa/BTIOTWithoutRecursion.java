package Dsa;
//binary tree inorder traversal without recursion


import java.util.Stack;

public class BTIOTWithoutRecursion {
    Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int temp){
            data = temp;
        }
    }
    void doInOrder(){
        if (root == null)return;
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || !stack.isEmpty()){
            while (curr !=null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }


    public static void main(String[] args) {
        BTIOTWithoutRecursion tree = new BTIOTWithoutRecursion();
        tree.root = new Node(20);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(15);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(35);
        tree.doInOrder();
    }
}
