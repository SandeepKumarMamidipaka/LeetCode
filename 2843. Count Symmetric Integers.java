class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for (int i = low; i <=high ; i++) {
            String s1="";
            s1+=i;
            if(s1.length()%2==0){
                if(half(s1)){
                    count++;
                    
                }
            }
        }
        return count;
    }
    public static boolean half(String s1){
        String r[]=s1.split("");
        int k=s1.length()/2;

        int res1=0,res2=0;
        for (int i=0;i<k;i++){

            int n1=Integer.parseInt(r[i]);
            res1+=n1;
        }

        for (int i=k;i<s1.length();i++){
            int n2=Integer.parseInt(r[i]);
            res2+=n2;
        }
        if(res1==res2){
            return true;
        }
        return false;
    }
}
