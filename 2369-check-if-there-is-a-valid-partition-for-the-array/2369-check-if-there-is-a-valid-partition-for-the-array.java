class Solution {
    public boolean validPartition(int[] nums) {
        boolean[] dp = new boolean[nums.length+1];
        dp[0]=true;
        for (int i = 2; i <= nums.length; i++){
            dp[i]|= nums[i-1]==nums[i-2] && dp[i-2]; // cond 1
            dp[i]|= i>2 && nums[i-1] == nums[i-2] && nums[i-2] == nums[i-3] && dp[i-3]; // cond 2
            dp[i]|= i>2 && nums[i-1]-nums[i-2]==1 && nums[i-2]-nums[i-3]==1 && dp[i-3]; // cond 3
        }
        return dp[nums.length];

        
//             if x == n:
//                 return true
//             if x+1 < n and nums[x] == nums[x+1] and ans(x+2):
//                 return True
//             if x+2 < n and nums[x] == nums[x+1] == nums[x+2] and ans(x+3):
//                 return True
//             if x+2 < n and nums[x]+1 == nums[x+1] == nums[x+2]-1 and ans(x+3):
//                 return True
//             return False
// //         int repele=0, conseno=0;
//         for(int i=0;i<nums.length-1;i++)
//             if(nums[i]==nums[i+1])
//                 repele++;
        
//         for(int i=0;i<nums.length-1;i++)
//             if(1+nums[i]==nums[i+1])
//                 conseno++;
//         if(repele>=2 && conseno>=3)
//             return true;
//         return false;

    }
}