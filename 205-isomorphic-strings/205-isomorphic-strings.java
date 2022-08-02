class Solution {
    public boolean isIsomorphic(String s, String t) {
        int ms[] = new int[256];
        int mt[] = new int[256];
        Arrays.fill(ms,-1);
        Arrays.fill(mt,-1);
        for(int i=0;i<s.length();++i){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(mt[c1]==-1 && ms[c2]==-1){
                mt[c1]=c2;
                ms[c2]=c1;
            }
            else if(!(mt[c1]==c2 && ms[c2]==c1))
                return false;
        }
        return true;
    }
}