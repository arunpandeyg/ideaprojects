package Dsa;
//find out number of islands
//dfs depth for search method

public class NumberOfIslands {
    public int numIslands(char[][] grid){
        if (grid == null || grid.length == 0) return 0;
        int isLandFound = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == '1'){
                    isLandFound += dfg(grid, i, j);
                }
            }
        }

        return isLandFound;
    }
    private  int dfg(char[][] grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return 0;
        }
        grid[i][j] = '0';
        dfg(grid, i + 1, j);
        dfg(grid, i - 1, j);
        dfg(grid, i, j + 1);
        dfg(grid, i, j - 1);
        return 1;
    }

    public static void main(String[] args) {
        NumberOfIslands noi = new NumberOfIslands();
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println("No of islands on grid 1: " + noi.numIslands(grid1));
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println("No of islands on grid 2:  " + noi.numIslands(grid2));
    }
}
