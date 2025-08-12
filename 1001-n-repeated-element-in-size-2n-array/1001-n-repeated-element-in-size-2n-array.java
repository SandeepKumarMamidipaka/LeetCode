class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int max=0;int key=0;
        for(Map.Entry<Integer,Integer> hm:map.entrySet()){
            if(hm.getValue()>max){
                max=hm.getValue();
                key=hm.getKey();
            }
        }
        return key;
    }
}