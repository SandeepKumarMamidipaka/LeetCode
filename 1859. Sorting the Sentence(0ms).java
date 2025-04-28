class Solution {
    public String sortSentence(String s) {
       
        String arr[]=s.split(" ");
        int n= arr.length;
        String res[]=new String[n];
        for (String val:arr){
            int ch=val.charAt(val.length()-1)-'1';
            res[ch]=val.substring(0,val.length()-1);
        }
        // System.out.println(Arrays.toString(res));
        String result="";
        for (int i = 0; i < res.length; i++) {
            if (i!=0){
                result+=" "+res[i];

            }
            else result+=res[i];
        }
        return result;
    }
}
