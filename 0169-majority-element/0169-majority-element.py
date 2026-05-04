class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n=int(len(nums)/2)
        freq={}
        for i in nums:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        print(freq,n)
        for key,value in freq.items():
            if n<value:
                return key