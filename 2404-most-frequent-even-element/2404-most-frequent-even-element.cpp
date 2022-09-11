class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        map<int, int> mp;
        for(auto x : nums){
            if(x%2 == 0)
                mp[x]++;
        }
        int ans =-1,freq=0;
        for(auto x : mp){
            if(freq < x.second){
                freq = x.second;
                ans = x.first;
            }
        }
        return ans;
    }
};