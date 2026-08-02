package Dsa;
//check if binary tree is a binary search tree.


public class BstValidate1 {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int tmp) {
            data = tmp;
        }
    }

private boolean isBst(Node node, int minValue, int maxValue){
        if (node == null)return Boolean.TRUE;
        if (node.data >= minValue
                && node.data < maxValue
                && isBst(node.left, minValue,node.data)
                && isBst(node.right, node.data, maxValue)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
}

public boolean isBst(){
        return isBst(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
}


    public static void main(String[] args) {
        BstValidate1 bt = new BstValidate1(); //static bst can be referenced by class
        root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(2);
        root.left.right = new Node(12);
        root.right.left = new Node(22);
        root.right.right = new Node(31);
        //root.right.right = new Node(1);
        System.out.println("is it Binary Search Tree? "+ bt.isBst());


    }
}
