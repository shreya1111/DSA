class Solution {
    public void flatten(TreeNode root) {

        if(root == null) return;

        ArrayList<TreeNode> arr = new ArrayList<>();

        dfs(root, arr);

        for(int i = 0; i < arr.size()-1; i++) {
            TreeNode a = arr.get(i);
            TreeNode b = arr.get(i+1);

            a.right = b;
            a.left = null;
        }

        TreeNode last = arr.get(arr.size()-1);

        last.left = null;
        last.right = null;
    }

    private void dfs(TreeNode root, ArrayList<TreeNode> list) {
        if(root == null) return;

        list.add(root);

        dfs(root.left, list);
        dfs(root.right, list);
    }
}