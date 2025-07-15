class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        int nc=0,vc=0,cc=0;
        String s="AEIOUaeiou";
        if(n<3){
            return false;
        }
        
        else{
            for(int i=0;i<n;i++){
                char ch=word.charAt(i);
                if((ch>='0' && ch<='9')||(ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                    nc++;
                }
                else{
                    return false;
                }
                if(s.contains(ch+"")){
                   vc++;
                }
                else if(!(s.contains(ch+""))&&!(ch>='0' && ch<='9')){
                    cc++;
                }
            }
            if(nc>=1 && vc>=1 && cc>=1){
                return true;
            }
            
        }
        return false;
    }
}