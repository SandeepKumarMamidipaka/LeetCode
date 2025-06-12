class Solution {
    public int maxAdjacentDistance(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            if (i==0){
                int n=Math.abs(nums[i]-nums[nums.length-1]);
                list.add(n);
                list.add(Math.abs(nums[i]-nums[i+1]));
            }
            else {
                list.add(Math.abs(nums[i]-nums[i+1]));
            }
        }
        // System.out.println(list);
        int max=0;
        for (int i:list){
            if (max<i){
                max=i;
            }
        }
        return max;
    }
}
