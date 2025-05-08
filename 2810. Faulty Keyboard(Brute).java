class Solution {
    public String finalString(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='i'){
                res+=ch;
            }
            else{
                String temp=res;
                res="";
                for(int j=temp.length()-1;j>=0;j--){
                    char c=temp.charAt(j);
                    res+=c;
                }
            }
        }
        return res;
    }
}
