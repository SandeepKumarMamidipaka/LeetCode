class Solution {
    public int numUniqueEmails(String[] emails) {
         HashSet<String> set=new HashSet<>();
        for (String s : emails) {

            String domain[] = s.split("@");
//            System.out.println(Arrays.toString(domain));

            String plus[] = domain[0].split("\\+");
//            System.out.println(Arrays.toString(plus));

            String dot[] = plus[0].split("\\.");
//            System.out.println(Arrays.toString(dot));

            String temp = "";
            for (String i : dot) {
                temp += i;
            }
            temp += "@";
            temp += domain[1];
            System.out.println(temp);
            set.add(temp);
        }
        return (set.size());
    }
}
