class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, rem = 0;
        int n = x;
        if( n < 0 )
        {
            return false;
        }
        while(n != 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;   
        }
        if( x == rev )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}