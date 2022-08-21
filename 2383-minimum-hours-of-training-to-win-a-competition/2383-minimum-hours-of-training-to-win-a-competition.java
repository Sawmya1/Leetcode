class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int energyCnt=0, finalE=0, expCnt=initialExperience, finalExp=0;
        for(int i=0;i<energy.length;i++)
            energyCnt += energy[i];
        if(energyCnt<initialEnergy)
            finalE=0;
        else
            finalE = energyCnt + 1 - initialEnergy;
        for(int i=0;i<experience.length;i++){
            if(experience[i]>=expCnt){
                finalExp += experience[i] + 1 - expCnt;
               // ans2+=experience[i]-sum2+1;
                expCnt+=experience[i] + finalExp;
            }
            else
                expCnt += experience[i];
        }
       // finalExp = expCnt;
        return finalE+finalExp;
    }
}