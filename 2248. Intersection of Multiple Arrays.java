class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] check= Arrays.copyOf(nums[0],nums[0].length);
        // System.out.println(Arrays.toString(check));
        for (int k = 0; k < check.length ; k++) {
            int nc=0;
            for (int i = 1; i < nums.length ; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (check[k]==nums[i][j]){
                        nc++;
                    }
                }
            }
            if (nc== nums.length-1){
                list.add(check[k]);
            }
        }
        Collections.sort(list);
        return list;
    }
}
