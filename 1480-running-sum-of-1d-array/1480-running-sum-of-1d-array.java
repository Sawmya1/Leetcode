class Solution {
    public int[] runningSum(int[] nums) {
     //   int sum = nums[0];
        for(int i=1;i<nums.length;i++){
           // sum = nums[i-1]+nums[i];
            nums[i] += nums[i-1];
        }
        return nums;
//         int n = nums.length, sum=0;
//         int run[] = new int[n];
        
//         for(int i=0;i<n;i++){
//             sum += nums[i];
//             run[i]=sum;
//         }
//         return run;
    }
}