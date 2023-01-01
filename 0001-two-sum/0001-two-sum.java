class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int ar[]=new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     ar[0]=i;
//                     ar[1]=j;
//                 }      
//             }
//             if(ar[0]!=0 && ar[1]!=0)
//                 break;
//         }
//         return ar;
        int ar[] = new int[2];
        HashMap<Integer,Integer> h= new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(target-nums[i])){
                ar[1]=i;
                ar[0]=h.get(target-nums[i]);
                return ar;
            }
            h.put(nums[i],i);
        }
        return ar;
    }
}