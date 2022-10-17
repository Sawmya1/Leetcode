class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] freq=new int[26];
        for(int i=0;i<sentence.length();i++){
            freq[sentence.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                return false;
            }
        }
        return true;

        // char ar[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        // boolean ans = false;
        // for(int i=0;i<ar.length;i++){
        //     for(int j=0;j<sentence.length();j++){
        //         if(ar[i]==sentence.charAt(j))
        //             ans=true;             
        //     }
        //     if(ans==false)
        //         return false;
        // }
        // return ans;
    }
}