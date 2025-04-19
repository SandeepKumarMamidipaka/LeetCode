class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         int m=matrix.length;
        int n=matrix[0].length;

        ArrayList<Integer> rowmin=new ArrayList<>();
        ArrayList<Integer> colmax=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();

        for (int i = 0; i <m; i++) {
            int min=matrix[i][0];

            for (int j = 0; j < n; j++) {
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
            rowmin.add(min);
        }
        // System.out.println(rowmin);
        for (int i = 0; i < n; i++) {
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if(max<matrix[j][i]){
                    max=matrix[j][i];
                }
            }
            colmax.add(max);
        }
        // System.out.println(colmax);
        for(int i:rowmin){
            if(colmax.contains(i)){
                res.add(i);
            }
        }
        return (res);
    }
}
