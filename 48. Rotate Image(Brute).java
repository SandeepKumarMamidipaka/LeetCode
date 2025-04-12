class Solution {
    public void rotate(int[][] matrix) {
       int m= matrix.length;
        int n=matrix[0].length;
        int[][] res=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i!=j){
                    res[i][j]=matrix[j][i];
                }
                else {
                    res[i][j]=matrix[i][j];
                }
            }
        }
        // System.out.println(Arrays.deepToString(matrix));
        // System.out.println(Arrays.deepToString(res));
        // System.out.println("changed");
        for (int i = 0; i < m; i++) {
            int l=0;
            int r=m-1;
            while(l<r){
                int temp=res[i][l];
                res[i][l]=res[i][r];
                res[i][r]=temp;
                l++;
                r--;
            }
        }
        // System.out.println(Arrays.deepToString(matrix));
        // System.out.println(Arrays.deepToString(res));
        // System.out.println("changed");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=res[i][j];
            }
        }
    }
}
