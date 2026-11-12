
class Solution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return max;
    }

    public int maxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int x = Math.max(0, maxPath(root.left));
        int y = Math.max(0, maxPath(root.right));

        int ans = x + y + root.val;

        max = Math.max(max, ans);

        return Math.max(x, y) + root.val;
    }
}
