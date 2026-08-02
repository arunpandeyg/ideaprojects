package Dsa;
//Validate binary search tree.


class BstValidate {
    Node root;
    static class Node {
        int data;
        Node left, right;
        Node(int temp){data = temp;}
    }
    private boolean isBST(Node node, int minValue, int maxValue){
        if (node == null) return Boolean.TRUE;
        if (node.data >= minValue
                && node.data < maxValue
                && isBST(node.left, minValue, node.data)
                && isBST(node.right, node.data, maxValue)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    public boolean isBST(){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        BstValidate bt = new BstValidate();
        bt.root = new Node(20);
        bt.root.left = new Node(10);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(2);
        bt.root.left.right = new Node(12);
        bt.root.right.left = new Node(22);;
        bt.root.right.right = new Node(31);
        //bt.root.right.right = new Node(31); //if modify data to less than 20 at right side it will say false not a binary tree.

        System.out.println("Is it BST: " + bt.isBST());
    }

}
