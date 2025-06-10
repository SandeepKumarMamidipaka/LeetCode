class Solution {
    public int maxDifference(String s) {
        int[] alpha=new int[26];
        for (Character c:s.toCharArray()){
            int n=c-'a';
            alpha[n]+=1;
        }
        // System.out.println(Arrays.toString(alpha));
        ArrayList<Integer> evenlist=new ArrayList<>();
        ArrayList<Integer> oddlist=new ArrayList<>();
        for (int i:alpha){
            if (i!=0){
                if (i%2==1){
                    evenlist.add(i);
                }
                else oddlist.add(i);
            }
        }
        // System.out.println(evenlist);
        // System.out.println(oddlist);
        Collections.sort(evenlist);
        Collections.sort(oddlist);
        return (evenlist.get(evenlist.size()-1)-oddlist.get(0));
    }
}
