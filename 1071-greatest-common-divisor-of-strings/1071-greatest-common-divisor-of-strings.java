class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length(), l2 = str2.length();
        if(!(str1+str2).equals(str2+str1))
            return "";
        int gcdl = gcd(l1, l2);
        return str1.substring(0, gcdl);       
    }
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
}