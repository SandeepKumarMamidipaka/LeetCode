class Solution {
    public boolean isSubstringPresent(String s) {
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            reverse+=ch;
        }
        // System.out.println(reverse);
         for(int i=1;i<s.length();i++){
            char f=s.charAt(i-1);
            char se=s.charAt(i);
            String temp=f+""+se+"";
            // System.out.println(temp);
            if(reverse.contains(temp)){
                return true;
            }
        }
        return false;
    }
}
