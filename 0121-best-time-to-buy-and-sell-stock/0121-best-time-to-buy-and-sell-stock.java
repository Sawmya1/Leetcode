import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0, minp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minp = Math.min(minp, prices[i]);
            maxp = Math.max(maxp, prices[i] - minp);
        }
        return maxp;
    }
}