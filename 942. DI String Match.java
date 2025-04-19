class Solution {
    public int[] diStringMatch(String s) {
        ArrayList<Integer> list=new ArrayList<>();

        int res[]=new int[s.length()+1];
        for (int i = 0; i <= s.length(); i++) {
            list.add(i);
        }

        // System.out.println(list);
        int index=0;
        int min=0;
        int max=s.length();

        for (Character ch:s.toCharArray()){
            if(ch=='I'){
                int val= list.get(min);
                res[index]=val;
                min++;
                index++;
            }
            else {
                int val=list.get(max);
                res[index]=val;
                max--;
                index++;
            }
        }
        // System.out.println(min+" "+max);
        if (min==max){
            res[list.size()-1]=min;
        }
        return res;
    }
}
