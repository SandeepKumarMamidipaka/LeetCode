class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        list1=s.split(" ")
        print(list1)
        res=""
        j=1
        for i in range(k):
            if j==k:
                res += list1[i]
            else:
                res+=list1[i]+" "
            j+=1
        print(res.rstrip())
        return res