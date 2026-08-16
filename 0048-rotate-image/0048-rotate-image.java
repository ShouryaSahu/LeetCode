class Solution {
    public void rotate(int[][] matrix) {
        // Transpose of Matrix
        for(int i = 0; i < matrix.length ; i++){
            for(int j = i + 1 ; j < matrix[0].length ; j++){
               swap(matrix, i, j, j, i);
            }
        }

        //Now reverse of matrix
        for(int i = 0; i < matrix.length ; i++){
            int left = 0;
            int right = matrix.length - 1;
            while(left < right){
                swap(matrix, i, left, i, right);
                left++;
                right--;
            }
        }        
    }

    private void swap(int[][] matrix, int row1, int col1, int row2, int col2){
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }
}