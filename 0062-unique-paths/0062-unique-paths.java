
import java.util.Arrays;

class Solution {
    public static int dfs(int i, int j, int m, int n,
                          boolean[][] vis, int[][] dp) {

        if (i < 0 || j < 0 || i >= m || j >= n || vis[i][j]) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        vis[i][j] = true;

        int x = dfs(i + 1, j, m, n, vis, dp);
        int y = dfs(i, j + 1, m, n, vis, dp);

        vis[i][j] = false;

        return dp[i][j] = x + y;
    }

    public int uniquePaths(int m, int n) {
        boolean[][] vis = new boolean[m][n];
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return dfs(0, 0, m, n, vis, dp);
    }
}
