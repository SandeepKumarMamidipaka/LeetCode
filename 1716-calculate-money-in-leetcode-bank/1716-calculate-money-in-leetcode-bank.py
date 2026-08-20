class Solution:
    def totalMoney(self, n: int) -> int:
        i=1
        res=0
        if n<=7:
            for i in range(1,n+1):
                res+=i
            return res
        itr= int(n/7)+1        
        for j in range(1,itr+1):
            if n-7>=0:
                for k in range(i,i+7):
                    res+=k
            else:
                for k in range(i,n+i):
                    res+=k
            n=n-7
            i+=1
        return res
            
