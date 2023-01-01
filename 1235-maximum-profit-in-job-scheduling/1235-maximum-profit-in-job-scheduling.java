/*
class Job implements Comparable<Job>{
    int start;
    int end;
    int profit;
    public Job(int s, int e, int p){
        start = s;
        end = e;
        profit = p;
    }
    public int compareTo(Job other){
        return this.end - other.end;
    }
}
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int num = startTime.length;
        if(num==0)
            return 0;
        int[] ans =  new int[num];
        Job[] jobs = new Job[num];
        for(int i=0;i<num;i++){
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
            ans[i] = 0;
        }
        Arrays.sort(jobs);
        int i,j;
        ans[0] = jobs[0].profit;
        int ret = Integer.MIN_VALUE;
        for(i=1;i<num;i++){
            ans[i] = Math.max(jobs[i].profit, ans[i-1]);
            ret = Math.max(ret, ans[i]);
            for(j=i-1;j>=0;j--){
                if(jobs[i].start >= jobs[j].end){
                    ans[i] = Math.max(ans[i], ans[j] + jobs[i].profit);
                    ret = Math.max(ret, ans[i]);
                    break;
                }
            }
        }
        return ret;
    }
}
*/
class Solution {
    
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        PriorityQueue<Job> pq = new PriorityQueue<>((e1, e2) -> e1.end - e2.end);
        TreeMap<Integer,Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for(int i = 0; i < startTime.length; i++){
            Job curr = new Job(startTime[i], endTime[i], profit[i]);
            pq.add(curr);
        }
        while(pq.size() != 0){
            Job curr = pq.poll();
            int start = curr.start;
            int end = curr.end;
            dp.put(end, Math.max(dp.floorEntry(start).getValue() + curr.profit, dp.floorEntry(end).getValue()));
        }
        return dp.lastEntry().getValue();
    }
}

class Job{
    int start;
    int end; 
    int profit;
    public Job(int start, int end, int profit){
        this.start = start;
        this.end = end;
        this.profit = profit;
    }
}