package Dsa;
//binary tree preorder inorder postorder traversal


public class BTPOIOPOTraversal {
    static class Node{
        int data;
        Node left, right;
        Node(int tmp){data = tmp;}
    }
    Node root;
    private void preOrderTraversal(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void preorderTraversal(){
        System.out.println("\n\n---Preorder Traversal---\n");
        preOrderTraversal(root);
    }
    private void inorderTraversal(Node root){
        if (root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    public void inorderTraversal(){
        System.out.println("\n\n---Inorder Traversal ---\n");
        inorderTraversal(root);
    }
    private void postorderTraversal(Node root){
        if (root == null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public void postorderTraversal(){
        System.out.println("\n\n---Postorder Traversal ---\n");
        postorderTraversal(root);
    }
    public static void main(String[] args) {
        BTPOIOPOTraversal btpo = new BTPOIOPOTraversal();
        btpo.root = new Node(20);
        btpo.root.left = new Node(10);
        btpo.root.right = new Node(30);
        btpo.root.left.left = new Node(2);
        btpo.root.left.right = new Node(12);
        btpo.root.right.left = new Node(22);
        btpo.root.right.right = new Node(31);
        btpo.preorderTraversal();
        btpo.inorderTraversal();
        btpo.postorderTraversal();
    }
}
