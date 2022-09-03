class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> unique = new HashSet<Integer>();
        for(int i=0;i<nums.length-1;i++){
            int l = unique.size();
            int sum = 0;
            sum = nums[i]+nums[i+1];
            unique.add(sum);
            if(unique.size() == l) 
                return true;
     //if len not increased even after adding that means al ready present

        }
        return false;
    }
}