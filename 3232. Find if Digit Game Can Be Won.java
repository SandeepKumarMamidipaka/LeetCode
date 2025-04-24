class Solution {
    public boolean canAliceWin(int[] nums) {
        int sc=0;int d=0;
        for(int i=0;i<nums.length;i++){
            String s=nums[i]+"";
            if(s.length()==1){
                sc+=nums[i];
            }
            else{
                d+=nums[i];
            }
        }
        if(sc==d){
            return false;
        }
        return true;
    }
}
