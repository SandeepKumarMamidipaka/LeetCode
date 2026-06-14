class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        dict1={}
        for i in nums:
            if i in dict1:
                dict1[i]+=1
            else:
                dict1[i]=1
        max_val=max(dict1.values())
        list1=[]
        for i in dict1:
            if max_val==dict1[i]:
                list1.append(i)
        return (list1)

        # print(dict1)
        