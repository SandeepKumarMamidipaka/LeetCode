class Solution {
    public char kthCharacter(int k) {
        String word="a";
        String gs="";
        while (word.length()<k){
            char ch=word.charAt(word.length()-1);
            if (word.length()==1) {
                char nxt = (char) (ch + 1);
                gs += nxt + "";
                word += gs;
            }
            else {
                String temp=gs;
                for (int i = 0; i <gs.length() ; i++) {
                    char t=(char)(gs.charAt(i)+1);
                    temp+=t;
                }
                gs=temp;
                word+=gs;
            }
        }
        return word.charAt(k-1);
    }
}