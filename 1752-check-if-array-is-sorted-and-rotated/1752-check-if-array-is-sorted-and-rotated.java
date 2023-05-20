class Solution {
    public boolean check(int[] nums) {
        // for(int i=0;i<nums.length-1;i++)
        //     if(nums[i] > nums[i+1])
        //         return false;
        // return true;  
        int n=nums.length;
        int cnt=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                cnt++;
            }
        }
        if(nums[n-1]>nums[0]){
            cnt++;
        }
        return cnt<=1;
    }
}