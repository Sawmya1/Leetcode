class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;

        // int m = matrix.length;
        // int n = matrix[0].length;
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i + 1 < m && j + 1 < n && matrix[i][j] != matrix[i + 1][j + 1]) {
        //             return false;
        //         }
        //     }
        // }
        // return true;

    }
}