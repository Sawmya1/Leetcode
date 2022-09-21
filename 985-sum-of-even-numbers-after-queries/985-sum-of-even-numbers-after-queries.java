class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int arr[] = new int[nums.length];
        int sum = sumOfArray(nums);
        int i=0;
        for(int query[]:queries)
        {
            if(nums[query[1]]%2==0)
                sum-=nums[query[1]];
            nums[query[1]]+=query[0];
            if(nums[query[1]]%2==0)
                sum+=(nums[query[1]]);
            arr[i++]=sum;
        }
        return arr;
    }
    public int sumOfArray(int arr[])
    {
        int sum=0;
        for(int a:arr)
        {
            if(a%2==0)
                sum+=a;
        }
        return sum;

        // int evenSum = 0, n = queries.length;
        // for (int x : nums) {
        //     if (x % 2 == 0) {
        //         evenSum += x;
        //     }
        // }
        // int[] ans = new int[n];
        // for (int i = 0; i < n; i++) {
        //     int val = queries[i][0], idx = queries[i][1];
        //     if (nums[idx] % 2 == 0) evenSum -= nums[idx];
        //     nums[idx] += val;
        //     if (nums[idx] % 2 == 0) evenSum += nums[idx];
        //     ans[i] = evenSum;
        // }
        // return ans;

    }
}