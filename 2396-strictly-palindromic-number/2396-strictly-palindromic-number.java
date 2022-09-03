class Solution {
    public boolean isStrictlyPalindromic(int n) {
     //    String a = Integer.toBinaryString(n);
     //    for(int i=n-1;i>=0;i--){
     //       // String a = Integer.toString(k);
     // //    if( !(s.charAt(i) == s.charAt(s.length()-i-1)) )
     //        char b = a.charAt(i), c = a.charAt(a.length()-i-1);
     //     //   if(a == a.subString(i));
     //        if(!(b==c))
     //            return false;
     //    }
     //    return true;
              for(int i=2;i<=n-2;i++){
          if( !checkPalindrome(Integer.toString(n,i)) )   
          return false;
      }
      return true;
    }
    
    public boolean checkPalindrome(String s){
        
        for(int i=0;i<s.length()/2;i++){
            
            if( !(s.charAt(i) == s.charAt(s.length()-i-1)) )
            return false;
        }
        return true;

    }
}