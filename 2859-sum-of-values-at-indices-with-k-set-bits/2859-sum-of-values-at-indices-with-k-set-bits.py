class Solution:
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        #print(bin(10)[2:])
        res=0
        for i in range(len(nums)):
            r=bin(i)[2:]
            s=str(r)
            c=0
            for j in range(len(s)):
                if s[j]=='1':
                    c+=1
            if c==k:
                res+=nums[i]
        return res

        