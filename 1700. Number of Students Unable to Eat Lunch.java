class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stuque=new ArrayDeque<>();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < students.length; i++) {
            stuque.offer(students[i]);
            stack.add(sandwiches[sandwiches.length-1-i] );
        }
        // System.out.println(stuque);
        // System.out.println(stack);
        int count=0;
        while (!(stuque.isEmpty())&&!(stack.isEmpty())){
            if(stuque.peek()==stack.peek()){
                stuque.poll();
                stack.pop();
                count=0;
            }
            else {
                int k=stuque.poll();
                stuque.offer(k);

                count++;
                if(count==stuque.size()) break;
            }
        }
        return stuque.size();
    }
}
