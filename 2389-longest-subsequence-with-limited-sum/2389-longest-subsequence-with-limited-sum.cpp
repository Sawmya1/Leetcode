class Solution {
public:
    vector<int> answerQueries(vector<int>& nums, vector<int>& queries) {
        sort(nums.begin(),nums.end());
        vector<int>v;
        
        for(int i=0;i<queries.size();i++){
            int sum = 0 , sz = 0;
            for ( int j=0;j<nums.size();j++){
                if ( sum + nums[j] <= queries[i] ) {
                    sz += 1;
                    sum += nums[j];
                }
                
            }
            
            v.push_back(sz);
            
        }
        
        return v;
    }
};