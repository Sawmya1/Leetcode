class Solution {
    public int countOdds(int low, int high) {
        return ((high + 1) / 2) - (low / 2);
        // int ans = 0;
        // for(int i=low; i<=high; i++){
        //     if(i % 2 != 0)
        //         ans++;
        // }
        // return ans;
    }
}