
class Solution {
    public void setZeroes(int[][] matrix) {
        int zero = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zero++;
                }
            }
        }

        int[] row = new int[zero];
        int[] col = new int[zero];
        int idx = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[idx] = i;
                    col[idx] = j;
                    idx++;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                for (int k = 0; k < zero; k++) {
                    if (i == row[k] || j == col[k]) {
                        matrix[i][j] = 0;
                        break;
                    }
                }

            }
        }
    }
}
