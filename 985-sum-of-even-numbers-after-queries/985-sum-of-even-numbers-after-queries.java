class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum = 0, n = queries.length;
        for (int x : nums) {
            if (x % 2 == 0) {
                evenSum += x;
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int val = queries[i][0], idx = queries[i][1];
            if (nums[idx] % 2 == 0) evenSum -= nums[idx];
            nums[idx] += val;
            if (nums[idx] % 2 == 0) evenSum += nums[idx];
            ans[i] = evenSum;
        }
        return ans;

    }
}