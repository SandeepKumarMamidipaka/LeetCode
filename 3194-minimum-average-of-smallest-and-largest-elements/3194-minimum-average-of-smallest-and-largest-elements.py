class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        i=0
        avg=[]
        while len(nums)!=0:
            k=min(nums)+max(nums)
            a=k/2
            avg.append(a)
            print(nums)
            nums.remove(min(nums))
            nums.remove(max(nums))
            i+=1
            print(i)
        print(avg)
        res=min(avg)
        return res


        