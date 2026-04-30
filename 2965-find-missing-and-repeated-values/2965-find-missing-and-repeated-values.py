class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        a=grid
        b=[]
        for i in a:
            if type(i)==list:
                b.extend(i)
            else:
                b.append(i)
        c=[]
        d=[]
        for i in b:
            if i in c:
                d.append(i)
            else:
                c.append(i)
        e=[i for i in range(1,len(b)+1)]
        d.extend([i for i in e if i not in c])
        return d