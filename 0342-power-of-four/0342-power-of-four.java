class Solution {
    public boolean isPowerOfFour(int n) {
       int p=1;
       if(n==1) return true;
       while(p<2147483647 && p>-2147483648){
            double k=Math.pow(4,p);
            System.out.println(k+" "+p);
            double num=n;
            if(k==num){
                
                return true;
            }
            if(k>num){
                return false;
            }
            p++;
       }
       return false;
    }
}