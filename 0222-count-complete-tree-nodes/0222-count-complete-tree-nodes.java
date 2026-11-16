class Solution {
    public int countNodes(TreeNode root) {

        if (root == null) return 0;

        int left = 0, right = 0;

        TreeNode l = root;
        TreeNode r = root;

        while (l != null) {
            left++;
            l = l.left;
        }

        while (r != null) {
            right++;
            r = r.right;
        }

        if (left == right) {
            return (1 << left) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}