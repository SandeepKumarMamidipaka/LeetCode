class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            int[] alpha=new int[26];
            // System.out.println(Arrays.toString(alpha));
            for (int i = 0; i < s.length(); i++) {
                char sc=s.charAt(i);
                int n=sc-'a';
                alpha[n]=alpha[n]+1;

                char tc=t.charAt(i);
                int n1=tc-'a';
                alpha[n1]=alpha[n1]-1;
            }
            // System.out.println(Arrays.toString(alpha));
            for (int i:alpha){
                if (i!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
