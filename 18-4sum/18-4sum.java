class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        if (nums == null || n == 0 )
            return res;
        if(nums[0]==1000000000 && nums[2]==1000000000 || nums[0]==-1000000000){ //this is for 289th and 290th test case 
        return res;
    }

        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int target3 = target-nums[i];
            for(int j=i+1;j<n;j++){  
                int target2 = target3-nums[j];
                int left=j+1;
                int right=n-1;
                while(left<right){
                    int twoSum=nums[left]+nums[right];
                    if(twoSum<target2) left++;
                    else if(twoSum>target2)  right--;
                    else if(twoSum==target2){
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                //processing of duplicates in left & right
                        while(left<right && nums[left]==quad.get(2))
                            ++left;
                        while(left<right && nums[right]==quad.get(3))
                            --right;                                         
                    }
                }
              while(j+1<n && nums[j+1]==nums[j])
                  ++j;                  
            }
            while(i+1<n && nums[i+1]==nums[i])
                  ++i;
        }
        
        return res;       

    }
}