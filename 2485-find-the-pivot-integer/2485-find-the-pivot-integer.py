class Solution:
    def pivotInteger(self, n: int) -> int:
        pivot=int(n/2)
        while pivot<=n:
            pl=0
            pr=0
            for i in range(1,pivot+1):
                pl+=i
            for i in range(pivot,n+1):
                pr+=i
            if pl==pr:
                return pivot
            pivot+=1
        return -1
