class Solution {
    public boolean isStrictlyPalindromic(int n) {
         for (int i = 2; i <=n-2; i++) {
            String bin=Integer.toString(n,i);
            System.out.println(bin);
            if (ispalin(bin)==false){
                return false;
            }
            
        }return true;
    }
    public static boolean ispalin(String s){
        String s1="";
        for (int i = s.length()-1; i >=0 ; i--) {
            s1+=s.charAt(i);
        }
        if (s1.equals(s)){
            return true;
        }
        return false;
    }
}
