package Dsa;
//find height and maximum depth of a binary tree
public class BstHeightDepth {
    private static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int tmp) {
            data = tmp;
        }
    }

    void insert(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        insertNode(root, data);
    }

    private Node insertNode(Node node, int data) {
        Node tempNode = null;
        if (data <= node.data) {
            if (node.left == null) {
                node.left = new Node(data);
                return node.left;
            } else {
                tempNode = node.left;
            }
        } else {
            if (node.right == null) {
                node.right = new Node(data);
                return node.right;
            } else {
                tempNode = node.right;
            }
        }
        return insertNode(tempNode, data);
    }

    public int findHeight() {
        return findNodeHeight(root);
    }

    private int findNodeHeight(Node node) {
        if (node == null) {
            return -1;
        }

        int rightNodeHeight = findNodeHeight(node.right);
        int leftNodeHeight = findNodeHeight(node.left);
        return Math.max(rightNodeHeight, leftNodeHeight) + 1;

        }
        public static void main (String[]args){
            BstHeightDepth bstHeightDepth = new BstHeightDepth();
            bstHeightDepth.insert(34);
            bstHeightDepth.insert(45);
            bstHeightDepth.insert(21);
            bstHeightDepth.insert(38);
            bstHeightDepth.insert(9);
            bstHeightDepth.insert(3);
            bstHeightDepth.insert(67);
            System.out.println("height of the tree: "+ bstHeightDepth.findHeight());
            System.out.println("Depth of the tree: "+ bstHeightDepth.findHeight());
        }
    }

