class Solution {
    public int smallestIndex(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp=0;
            int n=nums[i];
            while (n>0){
                int r=n%10;
                n=n/10;
                temp+=r;
            }
            if (i==temp){
                list.add(i);
            }
        }
       
        Collections.sort(list);
        return list.isEmpty()?-1:list.get(0);
    }
}
