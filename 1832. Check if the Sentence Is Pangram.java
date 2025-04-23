class Solution {
    public boolean checkIfPangram(String sentence) {
        char arr[]=sentence.toCharArray();

        TreeSet<Character> set1=new TreeSet<>();
        char ch='a';
        for (int i = 0; i < 26; i++) {
            set1.add(ch);
            ch++;
        }
        // System.out.println(set1);
        TreeSet<Character> set=new TreeSet<>();
        for (char c:arr){
            set.add(c);
        }
        // System.out.println(set);
        if (set.containsAll(set1)){
            return true;
        }
        return false;
    }
}
