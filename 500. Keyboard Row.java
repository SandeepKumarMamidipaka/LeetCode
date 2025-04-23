class Solution {
    public String[] findWords(String[] words) {
        String first="qwertyuiop";
        String second="asdfghjkl";
        String third="zxcvbnm";
        ArrayList<Character> fl=new ArrayList<>();
        ArrayList<Character> sl=new ArrayList<>();
        ArrayList<Character> tl=new ArrayList<>();
        for (Character c:first.toCharArray()){
            fl.add(c);
        }
        for (Character c:second.toCharArray()){
            sl.add(c);
        }
        for (Character c:third.toCharArray()){
            tl.add(c);
        }
        // System.out.println(fl);
        // System.out.println(sl);
        // String[] words = {"Hello","Alaska","Dad","Peace"};

        ArrayList<String> list=new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String s=words[i];
            String temp=words[i];
            s=s.toLowerCase();
            int fc = 0;int sc=0,tc=0;
            for (Character c:s.toCharArray()) {
                if (fl.contains(c)) {
                    fc++;
                } else if (sl.contains(c)) {
                    if ((fc != 0) || (tc != 0)) {
                        break;
                    }
                    sc++;
                } else {
                    if ((sc != 0) || (fc != 0)) {
                        break;
                    }
                    tc++;
                }
            }
            if((fc==s.length())||(sc==s.length())||(tc==s.length())){
                list.add(temp);
            }
        }
        String res[]=new String[list.size()];
        int j=0;
        for(String ss:list){
            res[j++]=ss;
        }
        return res;
    }
}
