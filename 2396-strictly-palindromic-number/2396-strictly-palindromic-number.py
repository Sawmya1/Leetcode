class Solution(object):
    def isStrictlyPalindromic(self, n): 
            x = bin(n);
            return str(x)==str(x)[::-1]
        