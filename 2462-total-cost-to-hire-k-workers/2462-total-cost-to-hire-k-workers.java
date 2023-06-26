// class Solution {
//     public void shiftDelete(int[] costs, int index){
//         for(int i=index;i<costs.length-1;i++){
//             costs[i] = costs[i+1];
//         }   
//     }
//     public long totalCost(int[] costs, int k, int candidates) {
//         int totalCost = 0;
//         while(k > 0){
//             int minimum = costs[0], index = 0;
//             for(int i=0;i<costs.length;i++){
//                 if(minimum > costs[i]){
//                     minimum = costs[i];
//                     index = i;
//                 }
//             }
//             totalCost += minimum;
//             shiftDelete(costs,index);
//             k--;
//         }    
//         return totalCost;
//     }
// }
class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int i = 0;
        int j = costs.length - 1;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long ans = 0;
        while (k-- > 0) {
            while (pq1.size() < candidates && i <= j) {
                pq1.offer(costs[i++]);
            }
            while (pq2.size() < candidates && i <= j) {
                pq2.offer(costs[j--]);
            }

            int t1 = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
            int t2 = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;

            if (t1 <= t2) {
                ans += t1;
                pq1.poll();
            } else {
                ans += t2;
                pq2.poll();
            }
        }
        return ans;
    }
}