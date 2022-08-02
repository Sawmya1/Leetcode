class Solution {
      
    public int lessEqual(int[][] matrix, int target){
        int count = 0 , len = matrix.length, i = len-1, j=0;
        while(i >=0 && j<len){
            if(matrix[i][j] > target){
                i--;
            }
            else
            {
                count = count + i +1;
                j++;
            }
        }
        return count;
    }

    public int kthSmallest(int[][] matrix, int k) {
        
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        
        while(low<high){
            int mid = low+(high-low)/2;
            int count = lessEqual(matrix,mid);
            if(count < k){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
            
        }
}
        
//      int[] oneDArray = new int[arr.length * arr.length];
//      for(int i = 0; i < arr.length; i ++)
//         for(int s = 0; s < arr.length; s ++)
//            oneDArray[(i * arr.length) + s] = arr[i][s];
        
//     Arrays.sort(oneDArray);
  
//         return oneDArray[k-1];
//       }
// }
/*
        int n= matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        
        while(low < high){
            int mid = low + (high - low)/2;
            int count = lessEqual(matrix,mid);
            if(count < k){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
        
    }
    
    //from left bottom or right top we can count how many numbers are equal or less than our target
    
    public int lessEqual(int[][] matrix, int target){
        int count = 0 , len = matrix.length, i = len-1, j=0;
        
        while(i >=0 && j<len){
            if(matrix[i][j] > target){
                i--;
            }
            else
            {
                count = count + i +1;
                j++;
            }
        }
        return count;
    }
}
*/