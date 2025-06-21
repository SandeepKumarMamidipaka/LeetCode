class Solution {
    public int addDigits(int num) {
        String s=num+"";
        while (s.length()!=1){
            int sum=0;
            while (num>0){
                int r=num%10;
                num/=10;
                sum+=r;
            }
            System.out.println(sum);
            s=sum+"";
            num=sum;
        }
        return Integer.parseInt(s);
    }
}
