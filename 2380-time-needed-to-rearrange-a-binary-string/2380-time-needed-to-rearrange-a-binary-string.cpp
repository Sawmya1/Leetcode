class Solution {
public:
    int secondsToRemoveOccurrences(string s) {
               int c=0;
        
        
        for(int i=0;i<s.length();i++)
        {
            bool cheak=false;
            
            for(int j=0;j<s.length()-1;j++)
            {
                if(s[j]=='0'&&s[j+1]=='1')
                {
                    cheak=true;
                    swap(s[j],s[j+1]);
                        j++;
                }
            }
            if(cheak)
            {
                c++;
                
            }
            else
            {
                break;
            }
        }
        return c;

    }
};