class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
            Arrays.sort(tokens);
    int l = 0, r = tokens.length - 1, score = 0;
    
    while(l <= r)
      if(power >= tokens[l])        {score++; power -= tokens[l++];}
      else if(score != 0 && l != r) {score--; power += tokens[r--];}
      else break;
    
    return score;

    }
}