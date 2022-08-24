class Solution {
    public boolean isPowerOfThree(int n) {
        while (n > 1) {
            if (n % 3 != 0) return false;
            n/=3;
        }
        return (n > 0);

        // if(n == 0)
        //     return false;
        // if(n == 1|| n == 3)
        //     return true;
        // for(int i=1;i<n/3;i++){
        //     if(Math.pow(3,i)==n)
        //         return true;
        // }
        // return false;
    }
}