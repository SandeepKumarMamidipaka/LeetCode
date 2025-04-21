class Solution {
    public int[] frequencySort(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // System.out.println(map);//{1=2, 2=3, 3=1}


        HashMap<Integer,Integer> temp=new HashMap<>(map);
        for (int i = 1; i <= temp.size(); i++) {
           
            int k=0; int min=Integer.MAX_VALUE;
            for (Map.Entry<Integer,Integer> hm:map.entrySet()){
                if (hm.getValue()<min){
                    min= hm.getValue();
                    k= hm.getKey();
                }
                else if (hm.getValue()==min) {
                    if(k<hm.getKey()){
                        k=hm.getKey();
                    }
                }
            }
            // System.out.println(k);
            map.remove(k);
            // System.out.println(map);
            for (int j = 0; j < min; j++) {
                list.add(k);
            }
        }
        // System.out.println(list);
        int res[]=new int[list.size()];
        int in=0;
        for (int i:list){
            res[in++]=i;
        }
        return res;
    }
}
