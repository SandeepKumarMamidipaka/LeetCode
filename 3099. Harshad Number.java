class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int k=x;
        while(x!=0){
            int r=x%10;
            x/=10;
            sum+=r;
        }
    
        if(k%sum==0){
            return sum;
        }
        return -1;
    }
}
