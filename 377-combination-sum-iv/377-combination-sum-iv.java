class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i=1;i<=target;i++)
            for(int n : nums)
                if(n <= i)
                    dp[i] += dp[i-n];
        return dp[target];
     
//         nums mai 1 hai aur target >0 hai toh 1 comb
//             for loop to check kitne comb ban sajte hai
//                 if symmetric then consider that too
                
    }
}