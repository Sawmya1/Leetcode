class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int count = 0;
        for(int k=0;k<n;k++)
            for(int j=0;j<k;j++)
                for(int i=0;i<j;i++)
                    if(nums[j]-nums[i] == diff && nums[k]-nums[j] == diff)
                        count++;
        return count;
        
        
//         int n=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=nums.length-1;j>=0;j--){
//                 if(nums[j]-nums[i]==diff)
//                     n++;
//             }
//         }
//         if(n<=1)
//             return 0;
//         if(n%2==0)
//             return n/2;
//         return (int) Math.ceil(n/2 + 1);
        
    }
}