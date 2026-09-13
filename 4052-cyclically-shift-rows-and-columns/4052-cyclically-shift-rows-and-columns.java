class Solution {

    public static void leftshift(int[][] grid, int i, int j, int n) {
        int[] temp = new int[n];

        int k = j % n;

        for(int p = 0; p < grid[0].length; p++) {
            int u = (p + k) % n;
            temp[p] = grid[i][u];
        }

        for(int p = 0; p < grid[0].length; p++) {
            grid[i][p] = temp[p];
        }
    }

    public static void uppershift(int[][] grid, int j, int i, int n) {
        int[] temp = new int[n];

        int k = i % n;

        for(int p = 0; p < grid.length; p++) {
            int u = (p + k) % n;
            temp[p] = grid[u][j];
        }

        for(int p = 0; p < grid.length; p++) {
            grid[p][j] = temp[p];
        }
    }

    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0; i < rowShift.length; i++) {
            leftshift(grid, i, rowShift[i], col);
        }

        for(int j = 0; j < colShift.length; j++) {
            uppershift(grid, j, colShift[j], row);
        }

        return grid;
    }
}