class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int max=Math.max(word1.length(),word2.length());
        int w1=word1.length();
        int w2=word2.length();
        for (int i = 0; i <max ; i++) {
            if ((w1>i)&&(w2>i)){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            else if (w2>i){
                sb.append(word2.charAt(i));
            }
            else {
                sb.append(word1.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
