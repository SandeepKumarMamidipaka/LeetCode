class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum<k){
            return sum;
        }
        else{
            sum=sum%k;
        }
        return sum;
    }
}
