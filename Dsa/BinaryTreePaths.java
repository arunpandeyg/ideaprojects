package Dsa;
//print all paths in binary tree.


import java.util.ArrayList;


import java.util.List;
public class BinaryTreePaths {
    static Node root;
       static class Node{
           int data;
           Node left, right;
           Node(int tmp){data = tmp;}
       }

       public List<String> getPaths(){

           List<String> paths = new ArrayList<>();
           if (root == null) return paths;

           preorderTraversal(root, " ", paths);
               return  paths;

       }
       private void preorderTraversal(Node node, String path, List<String> paths){
           path += node.data;

           if (node.left == null && node.right == null){
               paths.add(path);
               return;
           }
           if (node.left != null)preorderTraversal(node.left, path + "-->", paths);
           if (node.right != null)preorderTraversal(node.right, path + "-->", paths);
       }

    public static void main(String[] args) {
        BinaryTreePaths btp = new BinaryTreePaths();
        root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(2);
        root.left.right = new Node(12);
        root.right.left = new Node(22);
        root.right.right = new Node(31);
        List<String> paths = btp.getPaths();
        for (String path : paths){
            System.out.println("Paths: " + path);
        }

    }
}
