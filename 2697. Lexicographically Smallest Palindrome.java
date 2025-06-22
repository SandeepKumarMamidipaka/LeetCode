class Solution {
    public String makeSmallestPalindrome(String s) {
        String arr[]=s.split("");
        // System.out.println(Arrays.toString(arr));
        // System.out.println(s);
        int i=0;
        int j=s.length()-1;
        while (i<j){
            char st=s.charAt(i);
            char la=s.charAt(j);
            // System.out.println(st+" "+la);
            if (st==la){
                i++;
                j--;
            }
            else {
                if (st>la){
                    arr[i]=la+"";

                }
                else {
                    arr[j]=st+"";


                }
                i++;
                j--;
            }
        }
        // System.out.println(Arrays.toString(arr));
        String res="";
        for (String s1:arr){
            res+=s1;
        }
        return res;
    }
}
