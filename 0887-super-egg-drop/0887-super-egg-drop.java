class Solution {
    public int superEggDrop(int k, int n) {

        int[][] dp = new int[k + 1][n + 1];

        int moves = 0;

        while (dp[k][moves] < n) {

            moves++;

            for (int eggs = 1; eggs <= k; eggs++) {

                dp[eggs][moves] =
                    dp[eggs - 1][moves - 1]
                    + dp[eggs][moves - 1]
                    + 1;
            }
        }

        return moves;
    }
}