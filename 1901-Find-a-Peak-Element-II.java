class Solution {
    // Helper to find the row index of the maximum element in a given column
    private int getMaxRowIndex(int[][] mat, int col) {
        int maxRow = 0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > mat[maxRow][col]) {
                maxRow = i;
            }
        }
        return maxRow;
    }

    public int[] findPeakGrid(int[][] mat) {
        int startCol = 0;
        int endCol = mat[0].length - 1;

        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            int maxRow = getMaxRowIndex(mat, midCol);
            int leftNeighbor = (midCol - 1 >= 0) ? mat[maxRow][midCol - 1] : -1;
            int rightNeighbor = (midCol + 1 < mat[0].length) ? mat[maxRow][midCol + 1] : -1;
            if (mat[maxRow][midCol] > leftNeighbor && mat[maxRow][midCol] > rightNeighbor) {
                return new int[]{maxRow, midCol};
            }
            else if (rightNeighbor > mat[maxRow][midCol]) {
                startCol = midCol + 1;
            } 
            else {
                endCol = midCol - 1;
            }
        }

        return new int[]{-1, -1};
    }
}