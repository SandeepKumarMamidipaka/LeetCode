class Solution {
    public int mirrorDistance(int n) {
        
        int temp=n;
        int reverse=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            reverse=reverse*10+ r;
        }
        return Math.abs(temp-reverse);
    }
}