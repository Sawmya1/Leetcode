class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //calculating max Subarray sum using Kadane's Algorithm  
        int sum = 0, maxi = nums[0], total = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > maxi)
                maxi = sum;
            if(sum < 0)
                sum = 0;
            total += nums[i]; //calculating sum of elements of nums
        }
        int max2=0;
        sum=0;
        for(int x:nums){
            maxi=Math.max(maxi,total+max2); //updating max when right sum+x+max left sum>max
            total-=x; //right sum
            sum+=x; //left sum  
            max2=Math.max(max2,sum); //maximum left sum
        }

        return maxi;
    }
}