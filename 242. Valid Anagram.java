class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            String[] s1=s.split("");
            String[] t1=t.split("");
            Arrays.sort(s1);
            Arrays.sort(t1);
            System.out.println(Arrays.toString(s1));
            System.out.println(Arrays.toString(t1));
            for (int i = 0; i < s1.length ; i++) {
                if (!s1[i].equals(t1[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
