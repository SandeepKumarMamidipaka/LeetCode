class Solution {
    public int smallestNumber(int n, int t) {
        int res=0;
        for(int i=n;;i++){
            int k=i;
            int mul=1;
            while(k>0){
                int r=k%10;
                k=k/10;
                mul*=r;
            }
            if(mul%t==0){
                res=i;
                break;
            }

        }
        return res;
    }
}