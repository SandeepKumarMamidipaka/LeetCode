class Solution {
    public int maxFreqSum(String s) {
        HashSet<Character> vowel=new HashSet<>();
        HashSet<Character> consonat =new HashSet<>();
        for (Character c:s.toCharArray()){
            if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
                vowel.add(c);
            }
            else {
                consonat.add(c);
            }
        }
        // System.out.println(vowel);
        // System.out.println(consonat);
        int maxvc=0;
        for (char vow:vowel){
            int vc=0;
            for (Character ch:s.toCharArray()){
                if(vow==ch){
                    vc++;
                }
            }
            if (maxvc<vc){
                maxvc=vc;
            }
        }
        int maxcon=0;
        for (char con:consonat){
            int cc=0;
            for (Character ch:s.toCharArray()){
                if(con==ch){
                    cc++;
                }
            }
            if (maxcon<cc){
                maxcon=cc;
            }
        }
        return maxvc+maxcon;
    }
}
