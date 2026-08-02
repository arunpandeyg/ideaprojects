package Dsa;
//binary search tree min max


public class BstMinMax {
    private static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int tmp){data = tmp;}
    }
    static int findMinValue(){
        Node temp = root;
        while (temp.left != null){
            temp = temp.left;
        }
        return temp.data;
    }
    static int findMaxValue(){
        Node temp = root;
        while (temp.right != null){
            temp = temp.right;
        }
        return temp.data;
    }
    void insert(int data){
        if (root == null){
            root = new Node(data);
        }
        insertNode(root, data);
    }
    private Node insertNode(Node node, int data){
        Node tempNode = null;
        if (data <= node.data){
            if (node.left == null){
                node.left = new Node(data);
                return node.left;
            }else {
                tempNode = node.left;
            }
        }else {
            if (node.right == null){
                node.right = new Node(data);
                return node.right;
            }else {
                tempNode = node.right;
            }
        }
        return insertNode(tempNode,data);
    }

    public static void main(String[] args) {
        BstMinMax bstMinMax = new BstMinMax();
        bstMinMax.insert(45);
        bstMinMax.insert(89);
        bstMinMax.insert(234);
        bstMinMax.insert(6);
        bstMinMax.insert(12);
        bstMinMax.insert(78);
        bstMinMax.insert(90);
        System.out.println("Min Value: " + findMinValue());
        System.out.println("Max value: " + findMaxValue());
    }


}
