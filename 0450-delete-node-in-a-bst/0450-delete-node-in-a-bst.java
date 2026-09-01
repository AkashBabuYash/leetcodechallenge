class Solution {
    public static TreeNode find(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val == key) {
            return root;
        } 
        else if (root.val < key) {
            return find(root.right, key);
        } 
        else {
            return find(root.left, key);
        }
    }

    public static TreeNode successor(TreeNode temp) {
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        TreeNode temp = find(root, key);

        if (temp == null) {
            return root;
        }

        if (temp == root) {
            if (temp.left == null && temp.right == null) {
                return null;
            }

            if (temp.left == null) {
                return temp.right;
            }

            if (temp.right == null) {
                return temp.left;
            }

            TreeNode curr = successor(temp.right);
            temp.val = curr.val;
            temp.right = deleteNode(temp.right, curr.val);

            return root;
        }

        TreeNode parent = root;

        while (parent.left != temp && parent.right != temp) {
            if (key < parent.val) {
                parent = parent.left;
            } else {
                parent = parent.right;
            }
        }

        if (temp.left == null && temp.right == null) {
            if (parent.left == temp) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } 
        else if (temp.left == null) {
            if (parent.left == temp) {
                parent.left = temp.right;
            } else {
                parent.right = temp.right;
            }
        } 
        else if (temp.right == null) {
            if (parent.left == temp) {
                parent.left = temp.left;
            } else {
                parent.right = temp.left;
            }
        } 
        else {
            TreeNode curr = successor(temp.right);
            temp.val = curr.val;
            temp.right = deleteNode(temp.right, curr.val);
        }

        return root;
    }
}