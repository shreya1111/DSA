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
    public int countNodes(TreeNode root) {
        int c=1;
        TreeNode t=root;
        if(t == null){
            return 0;
        }
       
        if(t.left!=null){
            c=c+countNodes(t.left);
        }
        if(t.right!=null){
            c=c+countNodes(t.right);
        }
       
 return c;
       
    }
}