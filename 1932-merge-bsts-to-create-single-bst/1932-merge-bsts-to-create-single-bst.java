class Solution {

    public boolean valid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return valid(root.left, min, root.val) &&
               valid(root.right, root.val, max);
    }

    public boolean merge(TreeNode root, Map<Integer, TreeNode> map) {

    
        if (root.left == null && root.right == null) {

        
            if (map.containsKey(root.val)) {

                TreeNode tree = map.remove(root.val);

                root.left = tree.left;
                root.right = tree.right;
            }
        }

        if (root.left != null) {
            if (!merge(root.left, map)) {
                return false;
            }
        }

        if (root.right != null) {
            if (!merge(root.right, map)) {
                return false;
            }
        }

        return true;
    }

    public TreeNode canMerge(List<TreeNode> trees) {

        Map<Integer, TreeNode> map = new HashMap<>();

        Set<Integer> leaves = new HashSet<>();

        for (TreeNode tree : trees) {
            map.put(tree.val, tree);

            if (tree.left != null) {
                leaves.add(tree.left.val);
            }

            if (tree.right != null) {
                leaves.add(tree.right.val);
            }
        }

        TreeNode root = null;

        for (TreeNode tree : trees) {
            if (!leaves.contains(tree.val)) {
                root = tree;
                break;
            }
        }

        if (root == null) {
            return null;
        }

        map.remove(root.val);

     
        merge(root, map);

    
        if (!map.isEmpty()) {
            return null;
        }

      
        if (!valid(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            return null;
        }

        return root;
    }
}