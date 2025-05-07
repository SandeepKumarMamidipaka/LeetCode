class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int m=nums[nums.length-1];
        int sum=0;
        int temp=m;
        for(int i=0;i<k;i++){
            m=temp+i;
            sum+=m;
        }
        return sum;
    }
}
