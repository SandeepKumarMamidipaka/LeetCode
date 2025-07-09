class Solution {
    public int minimumSum(int num) {
        String s=num+"";
        String[] arr=s.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int res=0;
        for(int i=0;i<2;i++){
            String s1=arr[i]+arr[i+2];
            res+=Integer.parseInt(s1);
        }
        return res;
    }
}