class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int min = 20001;
        int max = -1;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        min--;
        int[] count = new int[max-min+1];
        Integer[] result = new Integer[nums.length];
        for (int i = nums.length-1; i >=0; i--) {
            int k = nums[i]-min-1;
            int c = 0;
            do {
                c += count[k];
                k -= (-k&k);
            } while (k > 0);
            result[i] = c;
            
            k = nums[i]-min;
            while (k < count.length) {
                count[k]++;
                k += (-k&k);
            }
        }
        
        return Arrays.asList(result);
    }
}
/*
 List<Integer> n=new ArrayList<Integer>();
        int cnt=0;
        if(nums.length<2){
            n.add(0);
            return n;
        }
        for(int i=0;i<nums.length;i++){
            cnt=0;
            for(int j=nums.length-1;j>=i;j--){
                if(nums[i]>nums[j]){
                    cnt++;
                }
            }
            n.add(cnt);
        }
        return n;
    }
*/