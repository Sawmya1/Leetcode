class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxCandies = 0;
        for(int i=0;i<candies.length;i++){
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= maxCandies)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}