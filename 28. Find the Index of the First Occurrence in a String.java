class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=0;String temp="";
        while ((i!=haystack.length())){
            if (j==needle.length()){
                j=0;
            }
            char first=haystack.charAt(i);
            char sec=needle.charAt(j);
            if (temp.equals(needle)){
                break;
            }
            if (first==sec){
                temp+=first;
                i++;
                j++;
            }
            else if (temp.isEmpty()){
                i++;
            }
            else {
                temp="";
                j=0;
                if(first==sec){
                    temp+=first;
                    i++;
                    j++;
                }
                else {
                    i++;
                }
            }
        }
        // System.out.println(temp);
        if((!temp.isEmpty())&&(temp.length()==needle.length())){
            char check=temp.charAt(0);
            for (int k=0;k<haystack.length();k++){
                char c=haystack.charAt(k);
                if(c==check){
                    return k;
                }
            }
        }
        return -1;
    }
}
