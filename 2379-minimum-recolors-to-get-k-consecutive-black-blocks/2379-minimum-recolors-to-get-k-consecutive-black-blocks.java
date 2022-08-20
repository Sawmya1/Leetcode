class Solution {
    public int minimumRecolors(String blocks, int k) {
        int cnt=0, min=k, n=blocks.length();
        for(int i=0;i<n-k+1;i++){
            int wordcnt=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W')
                    wordcnt++;
            }
            min=Math.min(wordcnt,min);
        }
        return min;          
    }
}