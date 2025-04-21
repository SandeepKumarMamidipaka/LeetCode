class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character,Integer> map=new HashMap<>();
        int val=1;int total=0;
        for (char ch='A';ch<='Z';ch++){
            map.put(ch,val++);
        }
        // System.out.println(map);
        if (columnTitle.length()==1){
            char ch=columnTitle.charAt(0);
            return (map.get(ch));
        }
        else {
            
            int mul=columnTitle.length()-1;
            for (int i = 0; i < columnTitle.length(); i++) {
                char ch=columnTitle.charAt(i);
                int t= map.get(ch);
                // System.out.println(ch+" "+t);
                t=t*(int)Math.pow(26,mul);

                total+=t;
                mul--;
            }
        }
        return total;
    }
}
