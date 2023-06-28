class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j && i<ch.length && j>=0){
            if((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') && (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u' || ch[j] == 'A' || ch[j] == 'E' || ch[j] == 'I' || ch[j] == 'O' || ch[j] == 'U')){
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
                i++;
                j--;   
            }else if((ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u' || ch[j] == 'A' || ch[j] == 'E' || ch[j] == 'I' || ch[j] == 'O' || ch[j] == 'U')){
                i++;
            }else if((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')){
                j--;
            }else{
                i++;
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int m = 0 ; m<ch.length; m++)
            sb.append(ch[m]);
        return sb.toString();         
    }
}