class Solution {
    public int countAsterisks(String s) {
        String arr[]=s.split("\\|");
        // System.out.println(Arrays.toString(arr));
        String temp="";
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                temp+=arr[i];
            }
        }
        // System.out.println(temp);
        int count=0;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i)=='*'){
                count++;
            }
        }
        return count;
    }
}
