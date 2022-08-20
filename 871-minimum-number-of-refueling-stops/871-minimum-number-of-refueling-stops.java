class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        if(startFuel >= target)
            return 0;
        int stop = 0, disCanTravel = startFuel;
        PriorityQueue<int[]> pq = new PriorityQueue<>((s1, s2)->{
            return Integer.compare(s2[1], s1[1]);
        });
        int i=0, n = stations.length, pS = 0;
        while(disCanTravel < target){
            //if ypu have enough fuel to reach the next station
            while(i<n && disCanTravel >= (stations[i][0]-pS))
                pq.add(stations[i++]);   
        if(pq.isEmpty()) return -1; //can't get fuel
        int[] refillAt = pq.poll(); //retrive first element
        // remaining fuel = fuel i started with - distance I travelled ahead from previous stoppage
        disCanTravel = disCanTravel - (refillAt[0]-pS) + refillAt[1];
        //Distance I can travell more
        target = target - (refillAt[0]-pS);
        pS = refillAt[0]; //for next time
        stop++;
      }
        // if(stations.length == null || target == startFuel)
        //     return 0;
        // int updateFuel = startFuel;
        // int i=0, count=0;
        // while(updateFuel != target){
        //     if(updatefuel >= stations[i][0]){
        //       updateFuel += stations[i++];
        //       count++;
        //     }
        // }
        // return count;
     return stop;
    }
}