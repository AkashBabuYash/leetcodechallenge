class Solution {

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;

 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int ans = 0;

        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for (int k = 0; k < size; k++) {

                int[] curr = q.poll();

                int i = curr[0];
                int j = curr[1];

                for (int[] d : dir) {

                    int ni = i + d[0];
                    int nj = j + d[1];

                    if (ni >= 0 && nj >= 0 &&
                        ni < n && nj < m &&
                        grid[ni][nj] == 1) {

                        grid[ni][nj] = 2;

                        fresh--;

                        q.add(new int[]{ni, nj});
                    }
                }
            }

            ans++;
        }

        if (fresh > 0) {
            return -1;
        }

        return ans;
    }
}