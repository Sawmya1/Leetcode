class Solution {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        //Binary Search Algo
        while(left<= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) right = mid-1;
            else left = mid+1;
        }
//returning left index as it contains the position where it would be if it were inserted in order.
        return left;

       //  int i=0;
       //  do{
       //      if(nums[i] == target && i <= nums.length)
       //          break;
       //      i++;
       //  }while(i <= nums.length && nums[i] <= target);
       // return i; 
    }
}