class Solution {
    public boolean isSubsequence(String s, String t) {
        // Boolean ans=true;
        //  for(int i=0;i<s.length();i++){
        //      String a=String.valueOf(s.charAt(i));
        //      if(!t.contains(a)){
        //          ans=false;
        //          break;
        //      }
        //  }
//         int j = 0;
//         for(int i = 0; i < t.length(); i++){
//             if(s.charAt(j)==t.charAt(i)){
//                 j++;
//             }
//         }
        
//         if(j>=s.length()){
//             return true;
//         }
        
   //     return false;

//         for(int i=0;i<s.length();i++)
//             for(int j=0;j<t.length();j++){
//                 if(s.charAt(i)!=s.charAt(j)){
//                     ans=false;
//                     break;
//                 }
//             }
     //   return ans;
    int n = s.length(), m = t.length();
    int i = 0, j = 0;
    while (i < n && j < m) {
        if (s.charAt(i) == t.charAt(j))
            i++;
        j++;
    }
    return i == n;
      
    }
}