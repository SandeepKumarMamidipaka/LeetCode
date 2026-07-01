class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        n=int(len(nums)/2)
        # print(n)
        dict1={}
        for i in nums:
            if i in dict1:
                dict1[i]+=1
            else:
                dict1[i]=1
        print(dict1)
        for i in dict1:
            if dict1[i]==n:
                return i