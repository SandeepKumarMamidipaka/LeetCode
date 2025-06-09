class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alpha=new int[26];
        // System.out.println(sentence.length());
        if (sentence.length() < 26){
            return false;
        }
        else {
            for (Character c:sentence.toCharArray()){
                int n=c-'a';
                alpha[n]=alpha[n]+1;
            }
            // System.out.println(Arrays.toString(alpha));
            for (int i:alpha){
                if (i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
