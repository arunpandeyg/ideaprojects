package Dsa;
/*
binary tree zigzag level order traversal
to solve this problem will use two stack,
*/

import java.util.Stack;

public class ZigzagLOT {
    static  Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int tmp){data = tmp;}
    }
    void zigZagTraversal(){
        if (root == null) return;
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        boolean leftToRight = true;
        currentLevel.push(root);
        while (!currentLevel.isEmpty()){
            while (!currentLevel.isEmpty()){
                Node node = currentLevel.pop();
                System.out.print(node.data + "-->");
                if (leftToRight){
                    addNode(nextLevel, node.left);
                    addNode(nextLevel, node.right);
                }else {
                    addNode(nextLevel, node.right);
                    addNode(nextLevel, node.left);
                }
            }
            leftToRight = !leftToRight;
            Stack<Node> tmpStack = currentLevel;
            currentLevel = nextLevel;
            nextLevel = tmpStack;
        }
    }
    void addNode(Stack<Node> stack, Node node){
        if (node != null)stack.push(node);
    }

    public static void main(String[] args) {
    ZigzagLOT tree = new ZigzagLOT();
    root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);
        tree.zigZagTraversal();
    }
}
