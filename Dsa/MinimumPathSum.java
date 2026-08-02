package Dsa;
//minimum path sum, (greedy algorithm* not working)


public class MinimumPathSum {
    public int minPathSum(int[][] grid){
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] dpSum = new int[m][n];
        dpSum[0][0] = grid[0][0];
        for (int i = 1; i < n; i++){
            dpSum[0][i] = dpSum[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++){
            dpSum[i][0] = dpSum[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                dpSum[i][j] = grid[i][j] + Math.min(dpSum[i - 1][j], dpSum[i][j - 1]);
            }
        }
        return dpSum[m - 1][n - 1];
    }

    public static void main(String[] args) {
        MinimumPathSum mps = new MinimumPathSum();
        System.out.println(mps.minPathSum(new int[][]{{1,3,1}, {1,5,1}, {4,2,1}}));
        System.out.println(mps.minPathSum(new int[][]{{1,2,3}, {4,5,6}}));


    }
}
