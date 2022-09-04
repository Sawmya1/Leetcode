class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int f = s.indexOf(c);
            int l = s.lastIndexOf(c);
            int diff = l-f-1;
            if(distance[c-'a'] != diff)
                return false;
        }
        return true;
    }
}