class Solution {
    public int concatenatedBinary(int n) {
        int M = 1000000007, l = 0;
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) l += 1;
            ans = ((ans << l) | i) % M;
        }
        return (int) ans;
    }
}