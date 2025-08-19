class Solution {
    public int[] productExceptSelf(int[] nums) {
         int prefix[] =new int[nums.length];
        prefix[0]=1;
        int n= nums.length;
        for (int i = 1; i <n ; i++) {
            prefix[i]=nums[i-1]*prefix[i-1];
        }
        // System.out.println(Arrays.toString(prefix));
        int suffix[] =new int[nums.length];
        suffix[n-1]=1;
        for (int i = n-2; i >=0 ; i--) {
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        // System.out.println(Arrays.toString(suffix));
        int[] res=new int[n];
        for (int i = 0; i < n; i++) {
            res[i]=suffix[i]*prefix[i];
        }
        return res;
    }
}