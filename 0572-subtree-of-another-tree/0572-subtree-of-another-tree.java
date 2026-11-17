
class Solution {

    public static boolean checkleft(TreeNode root, TreeNode subRoot) {

        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.val != subRoot.val) {
            return false;
        }

        return checkleft(root.left, subRoot.left) &&
               checkleft(root.right, subRoot.right);
    }

    public static boolean check(TreeNode root, TreeNode subRoot) {

        if (root == null) {
            return false;
        }

        if (root.val == subRoot.val) {
            if (checkleft(root, subRoot)) {
                return true;
            }
        }

        return check(root.left, subRoot) ||
               check(root.right, subRoot);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        return check(root, subRoot);
    }
}
