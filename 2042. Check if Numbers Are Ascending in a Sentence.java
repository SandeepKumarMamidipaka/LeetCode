class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> list=new ArrayList<>();
        String arr[]=s.split(" ");
        // System.out.println(Arrays.toString(arr));
        for(String s1:arr){
            char ch=s1.charAt(0);
            if(ch>='a' && ch<='z'){
                continue;
            }
            else{
                int temp=Integer.parseInt(s1);
                list.add(temp);
            }
            
        }
        // System.out.println(list);
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)>=list.get(i)){
                return false;
            }
        }
        return true;
    }
}
