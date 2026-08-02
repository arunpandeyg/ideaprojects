package Dsa;
//convert sorted array to a binary search tree


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){this.val = val;}
}
public class ConvertSortedArrayToBST {
      public TreeNode sortedArrayToBST(int[] nums){
          return helper(nums, 0, nums.length - 1);

      }
      private TreeNode helper(int[] nums, int start, int end){
          if (start > end) return null;
          int mid = start + (end - start) / 2;
          TreeNode root = new TreeNode(nums[mid]);
          root.left = helper(nums, start, mid - 1);
          root.right = helper(nums, mid + 1, end);
          return root;
      }
      public void preOrder(TreeNode node){
          if (node == null){
              return;
          }
          System.out.print(node.val + " ");
          preOrder(node.left);
          preOrder(node.right);
      }

    public static void main(String[] args) {
         int[] arr = new int[]{1,2,3,4,5,6,7};
         ConvertSortedArrayToBST bst = new ConvertSortedArrayToBST();
         bst.preOrder(bst.sortedArrayToBST(arr));
    }
}
