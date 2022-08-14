class Solution {
public:
    int edgeScore(vector<int>& edges) {
        map<int,long long>m;
        int max=0;
        int mk=-1;
        for(int i=0;i<edges.size();i++)
            m[edges[i]] += i;
        for(auto x:m){
            cout<<x.second<<" ,";
            if(x.second>max){
                max = x.second;
                mk=x.first;
                cout<<"maxkey:"<<mk<<" ";
            }
        }
       return mk; 
    }
};