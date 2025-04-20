class Solution {
    public boolean wordPattern(String pattern, String s) {
        String val[]=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();
        LinkedHashSet<Character> set1=new LinkedHashSet<>();
        LinkedHashSet<String> set2=new LinkedHashSet<>();

        for (Character c:pattern.toCharArray()){
            set1.add(c);
        }
        for (String s1:val){
            set2.add(s1);
        }
        // System.out.println(set1);
        // System.out.println(set2);
        ArrayList<Character> list1 = new ArrayList<>(set1);
        ArrayList<String> list2 = new ArrayList<>(set2);
        if(set1.size()!=set2.size()){
            return false;
        }
        else{
            for (int i = 0; i < list1.size(); i++) {
                char ch=list1.get(i);
                String str=list2.get(i);
                map.put(ch,str);
            }
            // System.out.println(map);

            int c=0;
            for (int i = 0; i < pattern.length(); i++) {
                char ch=pattern.charAt(i);
                String check=map.get(ch);
                // System.out.println(ch+" "+check);
                // System.out.println(val[i]);
                if(check.equals(val[i])){
                    c++;
                }
            }
            // System.out.println(c);
            if (c!=pattern.length()){
                return false;
            }
        }
        return true;
    }
}
