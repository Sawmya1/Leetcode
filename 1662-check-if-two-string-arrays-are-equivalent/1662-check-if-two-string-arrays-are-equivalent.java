class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1.length == 0 || word2.length == 0) return false;
        StringBuilder arr1 = new StringBuilder();
        StringBuilder arr2 = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length, word2.length); i++) {
            if (i < word1.length) {
                arr1.append(word1[i]);
            }

            if (i < word2.length) {
                arr2.append(word2[i]);
            }
        }
        return arr1.toString().equals(arr2.toString());

        // String ans1="", ans2="";
        // for(int i=0;i<word1.length;i++)
        //     ans1+=word1[i];
        // for(int i=0;i<word2.length;i++)
        //     ans2+=word2[i];
        // return ans1.equals(ans2);
        //return String.join("", word1).equals(String.join("", word2));
    }
}