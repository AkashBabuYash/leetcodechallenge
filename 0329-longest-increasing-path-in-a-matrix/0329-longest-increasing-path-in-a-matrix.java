
class Solution {
    public static int dfs(int[][] matrix, int i, int j, int n, int m, int[][] dp) {
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int ans = 1;

        for (int k = 0; k < 4; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];

            if (ni >= 0 && nj >= 0 && ni < n && nj < m
                    && matrix[ni][nj] > matrix[i][j]) {

                ans = Math.max(ans,
                    1 + dfs(matrix, ni, nj, n, m, dp));
            }
        }

        dp[i][j] = ans;
        return ans;
    }

    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, dfs(matrix, i, j, n, m, dp));
            }
        }

        return ans;
    }
}
