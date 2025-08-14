class Solution {
    public String largestGoodInteger(String num) {
        
        if(num.length()<3){
            return "";
        }
        else if(num.length()==3){
            char ch1=num.charAt(0);
            char ch2=num.charAt(1);
            char ch3=num.charAt(2);

            if(ch1==ch2 && ch3==ch1){
                return num;
            }
            else return "";
        }
        else{
            int max=0;String res="";
            for(int i=0;i<=num.length()-3;i++){
                String s=num.substring(i,i+3);
                char ch=s.charAt(0);int c=0;
                for(int j=0;j<3;j++){
                    if(ch==s.charAt(j)){
                        c++;
                    }
                    else{
                        break;
                    }
                }
                if(c==3){
                    String temp=s.charAt(0)+"";
                    int k=Integer.parseInt(temp);
                    if(max<=k){
                        max=k;
                        res=s;
                    }
                }
            }
            return res;
        }
        
    }
}