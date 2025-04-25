class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    sum+=mat[i][j];
                }
            }
            list.add(sum);
            map.put(i,sum);
        }
        // System.out.println(map);
        // System.out.println(list);
        Collections.sort(list);
        // System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int ck= list.get(i);
            for (Map.Entry<Integer,Integer> hm:map.entrySet()){
                if (hm.getValue()==ck){
                    al.add(hm.getKey());
                    map.remove(hm.getKey());
                    break;
                }
            }
        }
        // System.out.println(al);
        int []res=new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=al.get(i);
        }
        return res;
    }
}
