class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int res[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int s=suffix(nums,i);
            int p=prefix(nums,i);
            res[i]=s-p;
        }
        return (res);
    }
    public static int suffix(int[] nums,int n){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <=n ; i++) {
            set.add(nums[i]);
        }
        // System.out.println(set.size());
        return set.size();
    }
    public static int prefix(int[] nums,int n){
        HashSet<Integer> set=new HashSet<>();
        for (int i = n+1; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        // System.out.println(set.size());
        return set.size();
    }
}
