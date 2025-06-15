class Solution {
    public int maximumValue(String[] strs) {
        int []count=new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            String s=strs[i];
            int alpha_count=0,num_count=0;
            for (int j = 0; j <s.length() ; j++) {
                char ch=s.charAt(j);
//                System.out.println(ch+" "+j);
                if (ch>='a' && ch<='z'){
                    alpha_count++;
                }
                else {
                    num_count++;
                }
            }

            if (alpha_count>0 && num_count>0){
                count[i]=s.length();
            }
            else if (alpha_count>0 && num_count==0) {
                count[i]=s.length();
            }
            else if (num_count>0 && alpha_count==0) {
                count[i]=Integer.parseInt(s);
//                System.out.println(Integer.parseInt(s)+100);
            }
        }
        // System.out.println(Arrays.toString(count));
        Arrays.sort(count);
        return count[count.length-1];
    }
}
