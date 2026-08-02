package Dsa;
//identify mirror or create mirror BST


public class BSTMirror {
    Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int temp){
            data = temp;
        }
    }
    private Node createMirror(Node node){
        if (node == null)return node;
        Node leftNode = createMirror(node.left);
        Node rightNode = createMirror(node.right);
        node.left = rightNode;
        node.right = leftNode;
        return node;
    }
    public void createMirror(){
        createMirror(root);
    }
    private void printInOrder(Node node){
        if (node == null)return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
    private void printInOrder(){
        printInOrder(root);
        System.out.println();
    }
    public static void main(String[] args) {
        BSTMirror bts = new BSTMirror();
        bts.root = new Node(5);
        bts.root.left = new Node(6);
        bts.root.right = new Node(7);
        bts.root.left.left = new Node(8);
        bts.root.left.right = new Node(9);
        bts.printInOrder();
        bts.createMirror();
        bts.printInOrder();
    }
}
