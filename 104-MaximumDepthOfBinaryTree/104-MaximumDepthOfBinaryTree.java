// Last updated: 10/08/2026, 23:56:07
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
          if(root == null)
          return 0;
          int l=maxDepth(root.left);
          int r=maxDepth(root.right);
          return 1+Math.max(l,r);
    }

}