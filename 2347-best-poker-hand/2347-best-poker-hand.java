class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int cnt=0,ma=0;
        if(suits.length>=5){
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<suits.length;j++){
                if(suits[i]==suits[j]){
                    cnt++;
                    ma=Math.max(ma,cnt);
                }
            }
            cnt=0;
        }
        }  
        if(ma>=5)
            return "Flush";
        ma=0;
        cnt=1;
        if(ranks.length>=2){
            for(int i=0;i<ranks.length;i++){
                for(int j=i+1;j<ranks.length;j++){
                    if(ranks[i]==ranks[j]){
                        cnt++;
                        ma=Math.max(ma,cnt);
                    }        
                }
                cnt=1;
            }
            if(ma>=3)
                return "Three of a Kind";
            if(ma>=2)
                return "Pair";
        }
        return "High Card";
 
        
    }
}