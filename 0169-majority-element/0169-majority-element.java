class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n=nums.length/2;
        // System.out.println(map);
        for(Map.Entry<Integer,Integer> hm:map.entrySet()){
            if(n<hm.getValue()){
                return hm.getKey();
            }
        }
        return -1;
    }
}