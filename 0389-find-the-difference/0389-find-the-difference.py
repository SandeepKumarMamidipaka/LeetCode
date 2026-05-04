class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        tl=list(t)
        for ch in s:
            # print(ch)
            if ch in tl:
                # print(tl)
                tl.remove(ch)
        return str(tl[0])