class Solution {
    public int strStr(String haystack, String needle) {
        int hlen=haystack.length();
        int nlen=needle.length();
        for (int i = 0; i <=hlen-nlen ; i++) {
            String s=haystack.substring(i,i+nlen);
            if (s.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
