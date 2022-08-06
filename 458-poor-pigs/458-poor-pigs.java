class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        return (int)Math.ceil(Math.log(buckets) / Math.log(minutesToTest / minutesToDie +1));
//         if(buckets == 4 && minutesToTest >= 15)
//             return 2;
//         if(minutesToTest % minutesToDie == 0)
//         return (minutesToTest / minutesToDie)+1; 
        
//         return (int)(minutesToTest / minutesToDie); 
    }
}
//    return ceil(log(buckets) / log(totalTime / poisonTime + 1));
