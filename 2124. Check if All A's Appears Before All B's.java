class Solution {
    public boolean checkString(String s) {
        if (s.contains("b")){
            int index =s.indexOf('b');
            System.out.println(index);
            for (int i = index; i <s.length() ; i++) {
                char ch=s.charAt(i);
                if (ch=='a'){
                    return false;
                }
            }
        }
        else {
            return true;
        }
        return true;
    }
}
