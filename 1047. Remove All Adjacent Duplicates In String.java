class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.empty()){
                stack.push(ch);
            }
            else{
                if(stack.peek()!=ch){
                    stack.push(ch);
                }
                else{
                    stack.pop();
                }
            }
            
        }
        // System.out.println(stack);
        String res="";
        for(char c:stack){
            res+=c;
        }
          return res;
    }
}
