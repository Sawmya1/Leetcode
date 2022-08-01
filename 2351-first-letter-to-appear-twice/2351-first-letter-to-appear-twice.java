class Solution {
    public char repeatedCharacter(String s) {
        HashSet <Character> h = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(h.contains(c))
                return c;
            else
                h.add(c);
        }
        return '\0';        

        
    }
}