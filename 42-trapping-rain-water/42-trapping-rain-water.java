class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length-1, res = 0;
        int leftmax = 0, rightmax = 0;
        while(left <= right){
            if(height[left] <= height[right]){
               if(height[left] > leftmax)
                  leftmax = height[left];
               else
                   res += leftmax - height[left];
            left++;
           }
           else{
               
               if(height[right] > rightmax)
                  rightmax = height[right];
               else
                   res += rightmax - height[right];
             right--;
             }
        }    
        return res;
    }
}