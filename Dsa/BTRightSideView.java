package Dsa;
//binary tree right side view

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode3{
    int val;
    TreeNode3 left;
    TreeNode3 right;
    TreeNode3(int val) {this.val = val;}


}
public class BTRightSideView {
    public List<Integer> rightSideView(TreeNode3 root){
        if (root == null) return  new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode3> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode3 node = queue.remove();
                if (i == 0) result.add(node.val);
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }
         return result;
    }

    public static void main(String[] args) {
        TreeNode3 root = new TreeNode3(1);
        root.left = new TreeNode3(2);
        root.right = new TreeNode3(3);
        root.left.left = new TreeNode3(5);
        root.right.right = new TreeNode3(4);
        BTRightSideView btrsv = new BTRightSideView();
        System.out.println(btrsv.rightSideView(root));

    }
}
