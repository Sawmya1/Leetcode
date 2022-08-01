class Solution {
    public void sortColors(int[] nums) {
        int lo, mid, hi, temp;
        lo = 0;
        mid = 0;
        hi = nums.length-1;
        while(mid<=hi){
            switch(nums[mid]){
                case 0: {
                    temp=nums[lo];
                    nums[lo]=nums[mid];
                    nums[mid]=temp;
                    lo++;
                    mid++;
                    break;
                    }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp=nums[mid];
                    nums[mid]=nums[hi];
                    nums[hi]=temp;
                    hi--;
                    break;
                    }
            }
        }

    }
}