class Solution {
    public String sortString(String s) {
        ArrayList<Character> list=new ArrayList<>();
        for (Character c:s.toCharArray()){
            list.add(c);
        }
        // System.out.println(list);
        Collections.sort(list);
        // System.out.println(list);
        String res="";
        while (!list.isEmpty()){
            res+=small(list);
            res+=high(list);
        }
        return res;

    }
    public static String small(List<Character> list){
        String temp="";
        char ch='1';
        ArrayList<Character> lt=new ArrayList<>();

        for (int j = 0; j < list.size(); j++) {
            if (ch!=list.get(j)){
                ch= list.get(j);
                temp+=ch;
                lt.add(ch);
            }
        }
        // System.out.println(lt);
        // System.out.println(temp);
        // System.out.println(list);
        for (char c : lt) {
            list.remove(Character.valueOf(c));
        }
        return temp;
    }
    public static String high(List<Character> list){
        String temp="";
        char ch='1';
        ArrayList<Character> lt=new ArrayList<>();
        for (int j = list.size()-1; j >=0 ; j--) {
            if(ch!= list.get(j)){
                ch=list.get(j);
                temp+=ch;
                lt.add(ch);
            }
        }
        // System.out.println(temp);
        // System.out.println(list);
        for (char c : lt) {
            list.remove(Character.valueOf(c));
        }
        return temp;

    }
}
