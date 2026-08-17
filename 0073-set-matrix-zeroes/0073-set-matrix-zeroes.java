class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        //check first row
        for(int i = 0; i < n ; i++){
            if(matrix[0][i] == 0){
                firstRowZero = true;
                break;
            }
        }
        // check first column
        for(int i = 0; i < m ; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        //As we chech first row and col so we start traversing matrix from (1,1)
        for(int i = 1; i < m ; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    // set marker
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Now make marked row zero
        for(int i = 1; i < m ; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        // Now make marked col zero
        for(int j = 1; j < n ; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        //Now handle firstRow 
        if(firstRowZero){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }

        //Now handle firstCol
        if(firstColZero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}