class Solution {
    public void swap(int[][] matrix, int x, int y){
        int temp = matrix[x][y];
        matrix[x][y] = matrix[y][x];
        matrix[y][x] = temp;
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length; // rows
        int m = matrix[0].length; //columns
        int j =0;
        for(int i = 0; i < n -1 ; i++){
            for(j = i+1; j < m ; j++){
                swap(matrix,i,j);
            }
        }

        for(int i = 0; i< n;i++){
            int left = 0;
            int right = m-1;
            while(left<right){
               int temp = matrix[i][left];
               matrix[i][left] = matrix[i][right];
               matrix[i][right]= temp; 
               left++;
               right--;
            }
        }
    }
}