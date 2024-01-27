public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int count=0;
        for(int i=0;i<m;i++){
            int n=grid[i].length;
            for(int j=0;j<n;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}
