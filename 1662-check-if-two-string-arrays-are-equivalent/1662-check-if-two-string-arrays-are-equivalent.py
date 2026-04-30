class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        w1=""
        w2=""
        for s in word1:
            w1+=s
        for s in word2:
            w2+=s
        if w1==w2:
            return True
        return False

        