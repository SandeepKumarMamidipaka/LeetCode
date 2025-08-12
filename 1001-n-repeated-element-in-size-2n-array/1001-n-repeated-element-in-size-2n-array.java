class Solution {
    public int repeatedNTimes(int[] nums) {
       ArrayList<Integer> list=new ArrayList<>();
        for (int i:nums){
            if (!list.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
        int res=0;int max=0;
        for (int i:list){
            int c=0;
            for (int j:nums){
                if (i==j){
                    c++;
                }
            }
            if (max<c){
                res=i;
                max=c;
            }
        }
        return res;
    }
}