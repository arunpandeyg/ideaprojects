package Dsa;
//how to flatten binary tree to a linked list


public class FlattenBinaryTree {
    static Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int tmp){data = tmp;}
    }
    public  void flatten(){  //wrapper method
        flatten(root);
    }
    private void flatten(Node node){
        if (node == null || (node.left == null && node.right == null))return;
        if (node.left != null){
            flatten(node.left);
            Node tempNode = node.right;
            node.right = node.left;
            node.left = null;
            Node curr = node.right;
            while (curr.right != null){
                curr = curr.right;
            }
            curr.right = tempNode;
        }
        if (node.right != null){
            flatten(node.right);
        }
    }
    private  void inorder(Node node){
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + "-->");
        inorder(node.right);

    }
    public void inorder(){    //wrapper class
        inorder(root);
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        FlattenBinaryTree tree = new FlattenBinaryTree();
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);

        tree.inorder();
        tree.flatten();
        tree.inorder();

    }
}
