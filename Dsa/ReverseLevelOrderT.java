package Dsa;
//reverse level order traversal, starts from leaves to root and left to right.


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderT {
    static Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int tmp){data = tmp;}
    }
    void  reverseLevelOrder(){
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            stack.push(node);
            if (node.right != null){
                queue.add(node.right);
            }
            if (node.left != null){
                queue.add(node.left);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop().data + "-->");
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        ReverseLevelOrderT tree = new ReverseLevelOrderT();
        root = new Node(20);
        root.left = new Node(15);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(17);
        root.right.right = new Node(32);
        tree.reverseLevelOrder();
    }
}
