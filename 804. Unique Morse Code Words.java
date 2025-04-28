class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String pat[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> map=new HashMap<>();
        char ch='a';
        for (int i = 1; i <=26 ; i++) {
            map.put(ch,pat[i-1]);
            ch++;
        }
        // System.out.println(map);
        HashSet<String> set=new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String temp="";
            for (int j = 0; j < words[i].length(); j++) {
                char c=words[i].charAt(j);
                temp+=map.get(c);
            }
            // System.out.println(temp);
            set.add(temp);
        }
        return set.size();
    }
}
