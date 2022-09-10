class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0)
        {
          return 0;
        }
        int[][] dp = new int[k + 1][n];
        for (int i = 1; i <= k; i++)
        {
           int max = Integer.MIN_VALUE;
           for (int j = 1; j < n; j++)
           {
                 max = Math.max(max, dp[i - 1][j - 1] - prices[j - 1]);
                 dp[i][j] = Math.max(max + prices[j], dp[i][j - 1]);
           }
        }
        return dp[k][n - 1];

        // int maxProfit = 0;
        // int minProfit = Integer.MAX_VALUE;
        // for(int i=0;i<prices.length;i++){
        //     minProfit = Math.min(minProfit,prices[i]); //buying
        //     maxProfit = Math.max(maxProfit,prices[i]-minProfit); //selling
        // }
        // return maxProfit;
    }
}