class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[] { nums2[i], nums1[i] };
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long res = 0, totalSum = 0;
        for (int[] pair : pairs) {
            pq.add(pair[1]);
            totalSum += pair[1];
            if (pq.size() > k) {
                totalSum -= pq.poll();
            }
            if (pq.size() == k) {
                res = Math.max(res, totalSum * pair[0]);
            }
        }
        return res;

        // int n = nums1.length;
        // long[][] dp = new long[n+1][k+1];
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= Math.min(i, k); j++) {
        //         if (i == j) {
        //             dp[i][j] = (long)nums1[i-1] * (long)nums2[i-1];
        //         } else {
        //             dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1] + (long)nums1[i-1] * (long)nums2[i-1]);
        //         }
        //     }
        // }
        // return dp[n][k];

    }
}