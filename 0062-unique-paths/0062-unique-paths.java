class Solution {

    public static int count(int m, int n, int i, int j, int[][] dp) {

        if (i >= m || j >= n) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = count(m, n, i + 1, j, dp);
        int right = count(m, n, i, j + 1, dp);

        return dp[i][j] = down + right;
    }

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return count(m, n, 0, 0, dp);
    }
}