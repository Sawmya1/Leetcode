class Solution {
    public int numberOfCuts(int n) {
        if (n==0 || n==1)
            return 0;
        if(n%2==0)
            return (int)n/2;
        else
            return n;
        
    }
}