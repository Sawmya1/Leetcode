class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++)
//                 if(matrix[i][j]==target)
//                     return true;
            
//         }
//         return false;
        int n= matrix.length, m = matrix[0].length;
        int i=0, j=m-1;
        while(i<n && j>=0){
            if(target==matrix[i][j])
                return true;
            if(target>matrix[i][j])
                i+=1;
            else
                j-=1;            
        }
        return false;
    }
}
/*
        int n=matrix.length, m=matrix[0].length;
        int i=0, j=m-1;
        while(i<n&&j>=0){
            if(target==matrix[i][j])
                return true;
            if(target>matrix[i][j])
                i+=1;
            else
                j-=1;
        }
        return false;

*/