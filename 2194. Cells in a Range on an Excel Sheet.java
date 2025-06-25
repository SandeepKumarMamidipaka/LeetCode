class Solution {
    public List<String> cellsInRange(String s) {
        String arr[]=s.split("");
        int max=Math.max(Integer.parseInt(arr[1]),Integer.parseInt(arr[4]));
        int min=Math.min(Integer.parseInt(arr[1]),Integer.parseInt(arr[4]));
        // System.out.println(max);
        ArrayList<String> list=new ArrayList<>();
        char start=s.charAt(0);
        char end=s.charAt(3);
        // System.out.println(start+" "+end);

        for (char ch=start;ch<=end;ch++) {
            for (int i =min; i <=max ; i++) {
                list.add(ch+""+i);
            }
        }
        return list;
    }
}
