class Solution {
    public String interpret(String command) {
        String res="";
        if(command.charAt(0)=='G'){
            res+="G";
        }
        for (int i = 1; i < command.length(); i++) {
            char present=command.charAt(i);
            char prev=command.charAt(i-1);

            if (present=='a' && prev=='('){
                res+="al";
            }
            else if ((present=='G')){
                res+="G";
            }
            else if ((present==')')&&(prev=='(')) {
                res+="o";
            }
        }
        return res;
    }
}
