class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for (String s:patterns){
            if (word.contains(s)){
                // System.out.println(s);
                c++;
            }
        }
        return c;
    }
}
