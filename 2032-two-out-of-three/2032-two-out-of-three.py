class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        res=[]
        set1=set(nums1)
        
        set1.update(nums2)
        set1.update(nums3)

        print(set1)
        for i in set1:
            if (i in nums2 and i in nums3) or (i in nums1 and i in nums3) or (i in nums2 and i in nums1) :
                res.append(i)
        return res


        