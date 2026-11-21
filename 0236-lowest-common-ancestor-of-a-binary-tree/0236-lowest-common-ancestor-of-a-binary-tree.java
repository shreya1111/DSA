/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        boolean pLeftexist=exist(root.left,p);
        boolean qLeftexist=exist(root.left,q);
        if(pLeftexist && qLeftexist) return lowestCommonAncestor(root.left,p,q);
        else if(!pLeftexist && !qLeftexist) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
    private boolean exist(TreeNode root,TreeNode value){
        if(root == null) return false;
        if(root == value) return true;
        return exist(root.left,value) || exist(root.right,value);
    }
}