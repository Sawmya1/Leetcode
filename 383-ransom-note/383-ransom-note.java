class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(char ch: magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        for(char ch: ransomNote.toCharArray()) {
            int val = ch - 'a';
            if(count[val] <= 0) return false;
            count[val]--;
        }
        return true;

        // int flag=0;
        // for(int i=0;i<magazine.length();i++){}
        //   for(int j=0;j<ransomNote.length();j++){
        //     if(magazine.charAt(i)==ransomNote.charAt(j))
        //         flag = 1;
        //   }
        //   if(flag == 0)
        //       return false;
        // }
        // return true;
    }
}