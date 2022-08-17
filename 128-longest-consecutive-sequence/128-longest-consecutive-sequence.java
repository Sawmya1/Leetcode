class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            hashSet.add(nums[i]);
        int longestStreak=0;
        for(int i=0;i<nums.length;i++){
            if(!hashSet.contains(nums[i]-1)){
                int current=nums[i];
                int currentStreak=1;
                while(hashSet.contains(current+1)){
                    currentStreak+=1;
                    current+=1;
                }
                 longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}