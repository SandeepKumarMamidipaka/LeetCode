class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Math.pow(nums[i],2);
        }
        // System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        return nums;
    }
}
