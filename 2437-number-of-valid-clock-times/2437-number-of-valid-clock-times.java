class Solution {
    public int countTime(String time) {
        int ans = 1;
        if(time.charAt(0)=='?'){
            if(time.charAt(1)>='4'&& time.charAt(1)<='9')
                ans*=2; //0&1
            else
                ans*=3; //0,1,2
        }
        if(time.charAt(1)=='?'){
            if(time.charAt(0)=='?')
                ans=24;
            else if(time.charAt(0)=='2')
                ans*=4;
            else
                ans*=10;
        }
        if(time.charAt(3)=='?')
            ans*=6;
        if(time.charAt(4)=='?')
            ans*=10;
        return ans;
    }
}