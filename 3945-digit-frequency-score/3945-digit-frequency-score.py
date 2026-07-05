class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        s=str(n)
        res=0
        dict1={}
        for i in s:
            if i in dict1:
                dict1[i] += 1
            else:
                dict1[i]=1
        print(dict1)
        for i in dict1:
            j=int(i)*dict1[i]
            res+=j
        return res
         