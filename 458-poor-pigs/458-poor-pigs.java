class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int test = minutesToTest / minutesToDie;
        int i=0;
        while(Math.pow(test+1,i)< buckets){
            i++;
        }return i;

//         return (int)Math.ceil(Math.log(buckets) / Math.log(minutesToTest / minutesToDie +1));
// //         if(buckets == 4 && minutesToTest >= 15)
//             return 2;
//         if(minutesToTest % minutesToDie == 0)
//         return (minutesToTest / minutesToDie)+1; 
        
//         return (int)(minutesToTest / minutesToDie); 
    }
}
