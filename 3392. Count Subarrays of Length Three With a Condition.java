class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            int sum=nums[i]+nums[i+2];
            double val=nums[i+1]/2.0;
            if(sum==val){
                count++;
            }
        }
        return count;
    }
}
