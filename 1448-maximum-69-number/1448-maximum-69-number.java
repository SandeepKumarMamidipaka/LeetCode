class Solution {
    public int maximum69Number (int num) {
        String s=num+"";
        String[] arr=s.split("");
        int max=num;
        if(num==9999) return num;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("6")){
                String t="6";
                arr[i]="9";
                String temp="";
                for(int j=0;j<arr.length;j++){
                    temp+=arr[j];
                }
                arr[i]=t;
                System.out.println(temp+"----------");
                int k=Integer.parseInt(temp);
                System.out.println(k+"--------------");
                if(max<k){
                    max=k;
                }
            }
        }
        return max;
    }
}