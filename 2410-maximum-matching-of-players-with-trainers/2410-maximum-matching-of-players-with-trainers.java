class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0, j=0, cnt=0;
        int pl = players.length;
        int tr = trainers.length;
        while(i<pl && j<tr){
            if(trainers[j]>=players[i]){
                cnt++;
                i++;
                j++;
            }
            else
                j++;
        }
        return cnt;
    }
}