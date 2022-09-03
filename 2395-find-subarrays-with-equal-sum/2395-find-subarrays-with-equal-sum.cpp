class Solution {
public:
    bool findSubarrays(vector<int>& nums) {
        set<int> unique;
        for(int i=0;i<nums.size()-1;i++){
            int l = unique.size();
            int sum = 0;
            sum = nums[i]+nums[i+1];
            unique.insert(sum);
            if(unique.size() == l)
                return true;
        }
        return false;
    }
};