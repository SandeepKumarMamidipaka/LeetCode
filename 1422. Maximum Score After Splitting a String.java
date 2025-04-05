class Solution {
    public int maxScore(String s) {
        String[] arr=s.split("");
       
        int max=0;
        for(int i=0;i<s.length()-1;i++){ 
            String left="";String right="";
            for(int j=0;j<=i;j++){
                left+=arr[j];
            }
            for(int j=i+1;j<s.length();j++){
                right+=arr[j];
            }
            // System.out.println(left+" "+right);
            int zc=0;
            int oc=0;
            for(int j=0;j<left.length();j++){
                if(left.charAt(j)=='0'){
                    zc++;
                }
            }
            for(int j=0;j<right.length();j++){
                if(right.charAt(j)=='1'){
                    oc++;
                }
            }
            int res=zc+oc;
            if(res>max){
                max=res;
            }
        }
        return max;
    }
}
