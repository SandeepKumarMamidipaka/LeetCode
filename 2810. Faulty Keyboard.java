class Solution {
    public String finalString(String s) {
        StringBuilder res=new StringBuilder();
        for (Character c:s.toCharArray()){
            if (c=='i'){
                res.reverse();
            }
            else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
