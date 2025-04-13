class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
         ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=numOnes;i++){
            list.add(1);
        }
        for(int i=1;i<=numZeros;i++){
            list.add(0);
        }
        for(int i=1;i<=numNegOnes;i++){
            list.add(-1);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int res=0;
        int j=list.size()-1;
        for (int i = 1; i <=k ; i++) {
            res+=list.get(j);
            j--;
        }
        return res;
    }
}
