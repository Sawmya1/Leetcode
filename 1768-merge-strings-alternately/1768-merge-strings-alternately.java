class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n,m;
        n = word1.length();
        m = word2.length();
        String ans = "";
        int i=0;
        while(i<n && i<m){
            ans += word1.charAt(i);
            ans += word2.charAt(i);
            i++;          
        }  
        while(i<n){
            ans += word1.charAt(i);
            i++;
        }
         while(i<m){
            ans += word2.charAt(i);
            i++;
        }
        return ans;
    }
}