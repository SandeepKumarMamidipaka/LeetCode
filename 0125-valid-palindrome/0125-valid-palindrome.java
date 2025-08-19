class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        System.out.println(s);
        String str="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if ((ch>='a' && ch<='z')||(ch>='0' && ch<='9')){
                str+=ch;
            }
        }
        System.out.println(str);
        return palin(str);
    }
    public static boolean palin(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if (ch1!=ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}