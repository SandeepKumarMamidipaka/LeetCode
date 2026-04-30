class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        res=[]
        dict1={}
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j] in dict1:
                    dict1[grid[i][j]]+=1
                else:
                    dict1[grid[i][j]]=1
        c=0
        # print(dict1)
        for key,value in dict1.items():
            c+=value
            # print(f"{key}={value}")
            if value==2:
                res.append(key)
        # print(c)
        for i in range(1,c+1):
            j=0
            for key in dict1.keys():
                if key==i:
                    # print(key)
                    break
                else:
                    j+=1
            if j==len(dict1):
                res.append(i)
        return res