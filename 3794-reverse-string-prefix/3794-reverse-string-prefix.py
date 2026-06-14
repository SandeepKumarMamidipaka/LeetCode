class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        # print(len(s))    
        res=""    
        for i in range(k-1,-1,-1):
            res+=s[i]
        for i in range(k,len(s)):
            res+=s[i]
        return res

       