class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        for(int i = 0; i< rows;i++){
            for(int j =0; j<cols;j++){
                int currentArea = dfs(grid,i,j);
                maxArea = Math.max(maxArea,currentArea);
            }
        }
        return maxArea;
    }

    public static int dfs(int[][] grid, int i, int j){
        int rows = grid.length;
        int cols = grid[0].length;
        if(i>=rows || j>=cols || i<0 || j<0 || grid[i][j] == 0){
            return 0;
        }
        grid[i][j]=0;
        int currentArea = 1;
        currentArea += dfs(grid, i+1,j);
        currentArea += dfs(grid, i-1,j);
        currentArea += dfs(grid, i,j+1);
        currentArea += dfs(grid, i,j-1);
        return currentArea;
    }
}