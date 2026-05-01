class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        small=10000
        for i in range(len(nums)):
            s=str(nums[i])
            c=0
            for j in range(len(s)):
                c+=int(s[j])
            if i==c:
                if small>nums[i]:
                    return i
        return -1



        