class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int j=0, i=0; j<fruits.length; ++j){
            count.put(fruits[j], count.getOrDefault(fruits[j],0)+1);
            while(count.size() > 2){
                count.put(fruits[i], count.get(fruits[i]) - 1);
                count.remove(fruits[i], 0);
                ++i;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}