class Solution {
    public static boolean check(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }

        boolean normal = check(root1.left, root2.left) &&
                         check(root1.right, root2.right);

        boolean flipped = check(root1.left, root2.right) &&
                          check(root1.right, root2.left);

        return normal || flipped;
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return check(root1, root2);
    }
}