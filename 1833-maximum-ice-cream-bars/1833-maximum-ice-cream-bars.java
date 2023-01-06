class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // Arrays.sort(costs);
        // int n = costs.length;
        // int answer = 0;
        // // Pick ice creams till we can.
        // while (answer < n && costs[answer] <= coins) {
        //     // We can buy this icecream, reduce the cost from the coins. 
        //     coins -= costs[answer];
        //     answer += 1;
        // }
        // return answer;
        Arrays.sort(costs);
        int answer = 0, i = 0;
        while(i < costs.length && coins >= costs[i]){
            coins -= costs[i];
            answer++;
            i++;
        }
        return answer;
    }
}