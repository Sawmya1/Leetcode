class Solution {
    public int minimumRounds(int[] tasks) {   
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int t : tasks)     // Count frequency
           m.put(t, m.getOrDefault(t, 0) + 1);

        int rounds = 0;
        for (int freq : m.values()) {
            if (freq == 1) return -1;// impossible to complete
            rounds += (freq+2)/3;   // max possible rounds
    }
    return rounds;
   
        // int cnt = 0;
        // int round = 0;
        // for(int i=0;i<tasks.length;i++){
        //     cnt = 1;
        //     if(tasks[i] == tasks[i+1]){
        //         cnt++;
        //     }
        //     else{
        //         while(cnt >= 1){
        //         if(cnt%2 == 0){
        //             cnt -= 2;
        //             round++;
        //         }
        //         if(cnt%3 == 0){
        //             cnt -= 3;
        //             round++;
        //         }
        //         }
        //         if(cnt == 0)
        //             continue;
        //         else if(cnt == 1)
        //             return -1;      
        //     }
        // }
        // return round;
    }
}