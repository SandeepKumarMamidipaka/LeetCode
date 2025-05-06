class Solution {
    public String restoreString(String s, int[] indices) {
        Character []arr=new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int n=indices[i];
            arr[n]=s.charAt(i);
        }
        // System.out.println(Arrays.toString(arr));
        String res="";
        for (Character c:arr){
            res+=c;
        }
        return res;
    }
}
