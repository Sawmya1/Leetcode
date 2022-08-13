class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
    int n = words.size();
    int len = words[0].size();
    vector<int> ans;
    
    unordered_map<string, int> mp;
    
    for(string &str : words) {
        mp[str]++;
    }
    
    for(int i=0; i<s.size()-(n*len)+1; i++) {
        unordered_map<string, int>m;
        for(int j=i; j<i+n*len; j+=len) {
            string str = s.substr(j, len);
            m[str]++;
        }
        if(mp == m) {
            ans.push_back(i);
        }
       
    }
    return ans;
}
};