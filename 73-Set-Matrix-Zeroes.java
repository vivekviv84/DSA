class Solution {
    public void setColumnToZero(int[][] matrix, Set<Integer> targetColumn) {
        for (int i = 0; i < matrix.length; i++){
            for(int nums: targetColumn){
                if(matrix[i][nums] == 0){
                    Arrays.fill(matrix[i], 0);
                }
                else{
                matrix[i][nums] = 0;}
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns
        HashSet<Integer> col = new HashSet<>();

        for(int i = 0; i< m; i++){
            for(int j = 0 ; j<n; j++){
                if(matrix[i][j] == 0){
                    col.add(j);
                }
            }
        }
        setColumnToZero(matrix, col);

        return;
    }
}