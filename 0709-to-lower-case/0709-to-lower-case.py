class Solution:
    def toLowerCase(self, s: str) -> str:
        res=""
        for i in range(len(s)):
            k=ord(s[i])
            if s[i]>='A' and s[i]<='Z':
                ch=chr(k+32)
                res+=ch
            else:
                res+=s[i]
        return res