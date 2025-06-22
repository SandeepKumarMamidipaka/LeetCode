class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        // System.out.println(s.length());
        if (n%k==0){
                        int size=n/k;
            String res[]=new String[size];
            int j=0;
            for (int i = 0; i < s.length(); i+=k) {

                String s1=s.substring(i,k+i);
                // System.out.println(s1);
                res[j++]=s1;
            }
            // System.out.println(Arrays.toString(res));
            return res;
        }
        else {
            int size=s.length()/k+1;
            String res[]=new String[size];
            int j=0;
//            String s1="";
            for (int i = 0; i < s.length(); i+=k) {
                try {
                    String s1 = s.substring(i, i + k);
                    // System.out.println(s1);
//                    System.out.println(i);
                    res[j++]=s1;
                }
                catch (Exception e){
//                    System.out.println(i);
                    String s1=s.substring(i);
                    int t=k-s1.length();
                    for (int l = 1; l <=t ; l++) {
                        s1+=fill;
                    }
                    // System.out.println(s1);
                    res[j++]=s1;
                }
            }
            // System.out.println(Arrays.toString(res));
            return res;
        }
        // return new String[]{ "0" };
    }
}
