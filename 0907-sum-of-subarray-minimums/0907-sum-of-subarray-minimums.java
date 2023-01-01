class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] leftMin = new int[n];
        Arrays.fill(leftMin,-1);
        int[] rightMin = new int[n];
        Arrays.fill(rightMin,n);
        for(int i=0;i<n;i++) {
            int curele = arr[i];
            while(!stack.isEmpty() && arr[stack.peek()] >=curele ) {
                rightMin[stack.pop()] = i;
            }
            if(!stack.isEmpty()) leftMin[i] = stack.peek();
            stack.push(i);
        }
        long res = 0, mod = (int)1e9 + 7;
        for(int i = 0;i<n;i++){
           
            res = (res +  (long) Math.abs(i-leftMin[i]) * Math.abs(i-rightMin[i]) * arr[i] ) % mod;
        }
        return (int) res;
    }
}
