class Solution {
    public int maximum69Number (int num) {
        String s=num+"";int max=0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb=new StringBuilder(s);
            char ch=sb.charAt(i);
            if (ch=='9'){
                sb.replace(i,i+1,"6");
                // System.out.println(sb);
                int temp=Integer.parseInt(String.valueOf(sb));
                if((temp>max)&&(temp>num)){
                    max=temp;
                }
            }
            else {
                sb.replace(i,i+1,"9");
                // System.out.println(sb);
                int temp=Integer.parseInt(String.valueOf(sb));
                if((temp>max)&&(temp>num)){
                    max=temp;
                }
            }
        }
        
        return max==0?num:max;
    }
}
