class Solution {
    public int pivotInteger(int n) {
        int ans = (n * n + n ) /2;
        int sq = (int)Math.sqrt(ans);
        if(sq * sq == ans)return sq;
        else return -1;

        // p = (n * n + n) /2;
        // pi = (int)Math.sqrt(p);
        // if(pi*pi == p)
        //     return p;
        // else
        //     return -1;
        // // int sum = 0;
        // int ar[] = new int[n];
        // for(int i=0;i<n;i++){
        //     sum += ar[i];
        //     ar[i] = sum;
        // }
        // for(int i=0;i<n;i++){
        //     if(ar[i]==ar[n]+i-ar[i])
        //         return i;
        // }
        // return -1;
        // int nums[] = new int[n]; 
        // for(int i=0;i<n;i++)
        //     nums[i] = i;
//       int leftSum = 0,index = 0,sum = 0;
//         for(int i = 0; i < nums.length; i++)
//             sum += nums[i];
        
// while(index != nums.length && (leftSum != (sum - leftSum - nums[index]))){
//             leftSum += nums[index++];
//         }
//         if(index == nums.length){
//             return -1;
//         }
//         return index;
//         int suf[] = new int[n+1];
//         int pre[] = new int[n+1];
//         for(int i=1;i<=n;i++){
//             if(i==1)
//                 pre[i] = i;
                
//             pre[i] = pre[i-1] + i;
//         }
//         for(int i=n;i>0;i--){
//             if(n==i)
//                 suf[i] = i;
//             suf[i] = suf[i+1] + i;
//         }
//         for(int i=0;i<n;i++)
//             if(suf[i] == pre[i])
//                 return i+1;
//         return -1;
                
                
        
    }
}