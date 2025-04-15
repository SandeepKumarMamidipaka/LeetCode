class Solution {
    public String interpret(String command) {
        String str = command.replace("()", "o");
        String res = str.replace("(al)","al");
        return res;
    }
}
