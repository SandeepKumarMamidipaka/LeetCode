class Solution {
    public String sortSentence(String s) {
        TreeSet<Character> set=new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>='1' && ch<='9'){
                set.add(ch);
            }
        }
        // System.out.println(set);
        ArrayList<String> list=new ArrayList<>();
        String temp[]=s.split(" ");
        for (String ss:temp){
            list.add(ss);
        }
        // System.out.println(list);
        String res="";
        for (Character check:set){
            for (String val:list){
                if(val.contains(check+"")){
                    String t=val.replace(check+""," ");
                    res+=t;
                }
            }
        }
        return res.trim();
    }
}
