class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(i==0){
                if(ch=='}' || ch==')' || ch==']'){
                    return false;
                }
            }
            if (ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else {
//                System.out.println(stack.peek());
                if(!stack.isEmpty()){
                    if (ch==')' && stack.peek()=='('){
                        stack.pop();
                    }
                    else if (ch=='}' && stack.peek()=='{'){
                        stack.pop();
                    }
                    else if (ch==']' && stack.peek()=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
