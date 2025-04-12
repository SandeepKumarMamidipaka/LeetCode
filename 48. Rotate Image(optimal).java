class Solution {
    public void rotate(int[][] matrix) {
        int m= matrix.length;
        int n=matrix[0].length;
        for (int i = 0; i < m-1; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;            }
        }
        for(int i=0;i<m;i++){
            int l=0;
            int r= matrix[i].length;
            while(l<r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}
