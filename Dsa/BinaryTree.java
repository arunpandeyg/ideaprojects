package Dsa;
//Binary tree data structure introduction, in a binary tree a node can have at most two children.


public class BinaryTree{
    private Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int tmp){data = tmp;}
    }
    public void insert(int data){
       if (root == null){
           this.root = new Node(data);
           System.out.println(" --> inserted: " + data);
           return;
       }
       insertNode(root, data);
        System.out.println(" --> inserted: " + data);
    }
    private Node insertNode(Node root, int data){
        Node temp = null;
        System.out.print(" -->" + root.data);
        if (root.data >= data){
            System.out.print(" [L]");
            if (root.left == null){
                root.left = new Node(data);
                return root.left;
            }else {
                temp = root.left;
            }
        }else {
            System.out.print(" [R]");
            if (root.right == null){
                root.right = new Node(data);
                return  root.right;
            }else {
                temp = root.right;
            }
        }
        return insertNode(temp, data);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(39);
        tree.insert(45);
        tree.insert(23);
        tree.insert(9);
        tree.insert(366);
        tree.insert(124);
        tree.insert(90);
        tree.insert(46);
    }
}