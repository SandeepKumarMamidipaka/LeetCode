class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        for (String s:words){
            int c=0;
            for (int i = 0; i < s.length(); i++) {
                char ch=s.charAt(i);
                if (!allowed.contains(ch+"")){
                    c++;
                }
            }
            if (c==0){
                res++;
            }
        }
        return res;
    }
}