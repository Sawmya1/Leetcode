class Solution {
    public static int ways(int n,int t,int k,int[][] dp){
        if(n==0 && t==0){
            return 1;
        }
        if(t<0 ||n<0){
            return 0;
        }
        if(dp[n][t]!=-1){
            return dp[n][t];
        }
        int count=0;
        for(int i=1;i<=k;i++){
            count=(count+ways(n-1,t-i,k,dp))%1000000007;
        }
        dp[n][t]=count;
        return count;
    }
    
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp=new int[n+1][target+1];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        return ways(n,target,k,dp);
    }
}