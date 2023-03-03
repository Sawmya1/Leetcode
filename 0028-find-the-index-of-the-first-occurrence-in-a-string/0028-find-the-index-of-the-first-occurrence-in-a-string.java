class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length())
            return -1;
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j=0, k=i;
                while(j<needle.length() && k<haystack.length()){
                    if(haystack.charAt(k) == needle.charAt(j)){
                        j++;
                        k++;
                    }
                    else
                        break;
                }
               // return j;
                if(j == needle.length())
                   return i;
            }
        }
        return -1;
    }
}