class Solution {
    public void rotate(int[] nums, int k) {
                int n = nums.length;
        k = k % n;
        if (k == 0 || n == 0 || n == k) {
            return;
        }
        
        int count = 0;
        int start = 0;
        int current = start;
        int prev = nums[start];
        
        while (count < n) {
            current = (current + k) % n;
            int temp = nums[current];
            nums[current] = prev;
            prev = temp;
            count++;
            
            if (current == start) {
                start++;
                current = start;
                prev = nums[start];
            }
        }
        // int n = nums.length;
        // k = k % n;
        // int temp[] = new int[k];
        // for(int i = 0;i < k; i++)
        //     temp[i] = nums[i];
        // for(int i = k; i < n; i++)
        //     nums[i-k] = nums[i];
        // for(int i = n-k; i < n; i++)
        //     nums[i] = temp[i-(n-k)];
    }
}