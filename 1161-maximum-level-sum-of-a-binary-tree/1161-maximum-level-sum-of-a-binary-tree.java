class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 1;
        int ansLevel = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                sum += curr.val;

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                ansLevel = level;
            }

            level++;
        }

        return ansLevel;
    }
}