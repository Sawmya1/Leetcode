class Solution {
    public boolean isAnagram(String s, String t) {
        int ans=0;
        if(s.length()!=t.length())
             return false;
        char[] c1= s.toCharArray();
        char c2[]= t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        Boolean r = Arrays.equals(c1,c2);
        if(r)
            return true;
        else
            return false;

        
    }
}