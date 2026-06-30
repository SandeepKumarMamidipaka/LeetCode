class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        cap_count=0
        sma_count=0
        for i in range(len(word)):
            if ord(word[i])>=65 and ord(word[i])<=91:
                cap_count+=1
            else:
                sma_count+=1
        print(cap_count)
        print(sma_count)
        if cap_count==len(word) or sma_count==len(word):
            return True
        elif cap_count==1 and (ord(word[0])>=65 and ord(word[0])<=91) and sma_count==len(word)-1:
            return True
        
        return False

        