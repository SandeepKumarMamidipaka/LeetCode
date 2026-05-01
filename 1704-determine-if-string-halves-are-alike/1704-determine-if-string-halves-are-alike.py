class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        s=s.lower()
        n=(len(s)//2)
        sl=s[:n]
        sr=s[n:]
        # print(sl)
        # print(sr)
        vowel="aeiouAEIOU"
        slc=0
        for i in sl:
            if i in vowel:
                slc+=1
        src=0
        for i in sr:
            if i in vowel:
                src+=1
        return src==slc
    