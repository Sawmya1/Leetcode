class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;

        for (int price : prices) {
            buy = Math.max(buy, sell - price);
            sell = Math.max(sell, buy + price - fee);
        }

        return sell;

     //    int flag = 0, ans = 0, buy = 0;
     //    for(int i=0;i<prices.length;i++){
     //        if(flag == 0){
     //            buy = prices[i];
     //            flag = 1;
     //        }
     //       if(prices[i] > buy + fee){
     //            ans += (prices[i] - buy - fee);
     //            flag = 0;
     //        }
     // }
     // return ans;
    }
}