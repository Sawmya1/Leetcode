class Solution {
    public boolean isUgly(int n) {
        for(int i=2;i<6 && n>0;i++)
          while(n%i == 0)
            n /= i;
        return n == 1;
        // if(n <= 0)
        //   return false;
        // while(n % 2 == 0)  n/=2;
        // while(n % 3 == 0)  n/=3;
        // while(n % 5 == 0)  n/=5;
        // return n==1;

        // if(n==1)
        //   return true;
        // //prime factor ie. prime number 2, 3, 5 and not more then that i.e. 7
        // if(n%7==0)
        //   return false;
        // if(n%5==0 || n%3==0 || n%2==0)
        //   return true;
        // return false;
    }
}