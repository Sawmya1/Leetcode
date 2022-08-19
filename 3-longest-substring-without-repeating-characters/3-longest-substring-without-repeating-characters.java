class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        int n=s.length();
        int left=0, right=0;
        int len=0;
        for(int i=0;i<n;i++){
            if(mp.containsKey(s.charAt(i)))
                left = Math.max(mp.get(s.charAt(i))+1,left);
            mp.put(s.charAt(right),right);
            len = Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}