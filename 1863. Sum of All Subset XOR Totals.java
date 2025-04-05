class Solution {
    public int subsetXORSum(int[] nums) {
        int range=(int)Math.pow(2, nums.length);
        // System.out.println(range);
        int temp=0;
        for (int i=0;i<range;i++) {

            String s = String.format("%" + nums.length + "s", Integer.toBinaryString(i)).replace(' ', '0');

            ArrayList<Integer> al=new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == '1') {
                    al.add(nums[j] );
                }
            }
            // System.out.println(al);
            if(al.size()==1){
                temp+=al.get(0);
            }
            else if(al.size()>1){

                for (int j = 1; j < al.size(); j++) {
                    int fst=al.get(j-1);
                    int sec=al.get(j);
                    int xor=fst^sec;

                    al.set(j,xor);
                    // System.out.println(al);
                }
                temp+=al.get(al.size()-1);
            }
        }
        return temp;
    }
}
