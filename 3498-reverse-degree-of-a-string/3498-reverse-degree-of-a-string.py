class Solution:
    def reverseDegree(self, s: str) -> int:
        i=26
        ch='a'
        alphabets={}
        while i>0:
            alphabets[ch]=i
            ch=chr(ord(ch)+1)
            i=i-1
        print(alphabets)
        final_sum=0
        for i in range(len(s)):
            prod=(i+1)*alphabets[s[i]]
            final_sum+=prod
        return final_sum

        
        