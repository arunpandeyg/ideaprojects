package Dsa;
//serialize and deserialize binary tree


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SAndDBinaryTree {
    private static String delimiter = ",";
    private static String noNode = "N";

    //encode a tree to a single String
    public String serialize(TreeNode root){
        StringBuilder sb = new StringBuilder();
        serializeNode(sb, root);
        return sb.toString();
    }
    private void serializeNode(StringBuilder sb, TreeNode root){
        if (root == null){
            sb.append(noNode).append(delimiter);
        }
        else {
            sb.append(root.val).append(delimiter);
            serializeNode(sb, root.left);
            serializeNode(sb, root.right);
        }
    }
    //Decoded encoded data to tree
    public TreeNode deserialize(String data){
        List<String> parts = Arrays.asList(data.split(delimiter));
        Deque<String> queue = new LinkedList<>(parts);
        return deserializeNode(queue);
    }
    private TreeNode deserializeNode(Deque<String> queue){
        String val = queue.remove();
        if (val.equals(noNode)){
            return null;
        }
        else {
            TreeNode root = new TreeNode(Integer.parseInt(val));
            root.left = deserializeNode(queue);
            root.right = deserializeNode(queue);
            return root;
        }
    }

    public static void main(String[] args) {
        SAndDBinaryTree sd = new SAndDBinaryTree();

    }
}
