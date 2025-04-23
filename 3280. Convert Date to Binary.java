class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        String res="";
        for (int i=0;i< arr.length;i++){
            String s=arr[i];
            int n=Integer.parseInt(s);
            String bin=Integer.toBinaryString(n);
            if(i== arr.length-1){
                res+=bin;
            }
            else
            res+=bin+"-";
        }
        return res;
    }
}
