
class Solution {
    public static TreeNode search(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        TreeNode leftResult = search(root.left, val);

        if (leftResult != null) {
            return leftResult;
        }

        TreeNode rightResult = search(root.right, val);

        return rightResult;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }
}
