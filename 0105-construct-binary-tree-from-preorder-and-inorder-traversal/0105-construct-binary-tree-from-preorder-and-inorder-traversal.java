class Solution {

    public TreeNode build(int[] preorder, int[] inorder, int start, int end,
                          HashMap<Integer, Integer> map, int[] index) {

        if (start > end) {
            return null;
        }

        int value = preorder[index[0]++];
        TreeNode root = new TreeNode(value);

        int idx = map.get(value);

        root.left = build(preorder, inorder, start, idx - 1, map, index);
        root.right = build(preorder, inorder, idx + 1, end, map, index);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        int[] index = {0};

        return build(preorder, inorder, 0, inorder.length - 1, map, index);
    }
}