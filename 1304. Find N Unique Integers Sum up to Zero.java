class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        int j=0;
        int k=n/2;
        System.out.println(k);
        for (int i =1; i <=k ; i++) {
            res[j]=i;
            res[j+1]=-i;
            j=j+2;
        }
        if (n%2==1){
            res[j]=0;
        }
        Arrays.sort(res);
        return res;

    }
}
