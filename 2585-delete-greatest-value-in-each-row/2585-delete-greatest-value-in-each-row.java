class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n=grid[0].length;
        int res=0;
        for(int k=0;k<n;k++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<grid.length;i++){
                int row_max=Integer.MIN_VALUE;
                int jj=0;
                for(int j=0;j<grid[i].length;j++){
                    if(row_max<grid[i][j]){
                        row_max=grid[i][j];
                        jj=j;
                    }
                }
                grid[i][jj]=0;
                if(row_max>max){
                    max=row_max;
                }
            }
            res+=max;
        }
        return res;
    }
}