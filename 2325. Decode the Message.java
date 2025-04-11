class Solution {
    public String decodeMessage(String key, String message) {
        // String s[]=key.split(" ");
        // String temp="";
        // for(String i:s){
        //     temp+=i;
        // }
        // System.out.println(temp);
        // System.out.println(temp.length());
        LinkedHashMap<Character,Character> map=new LinkedHashMap<>();
        char v='a';
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch==' '){
                continue;
            }
            else if(!map.containsKey(ch)){
                map.put(ch,v);
                v++;
            }
        }
        System.out.println(map);
        String res="";
        for (int i = 0; i < message.length(); i++) {
            char m=message.charAt(i);
            if(m==' ') {
                res+=" ";
            }
            else {
                if(map.containsKey(m)){
                    res+=map.get(m);
                }
            }
        }
        return res;
    }
}
