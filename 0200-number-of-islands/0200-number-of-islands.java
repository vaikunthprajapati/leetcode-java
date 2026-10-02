class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        int[][] directions = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[] {i,j});
                    grid[i][j]='0';
                    while(!queue.isEmpty()){
                        int[] cell = queue.poll();
                        int r = cell[0];
                        int c = cell[1];
                        for(int[] dir: directions){
                            int newRow = r + dir[0];
                            int newCol = c + dir[1];
                            if(newRow >= 0 && newCol >=0 && newRow < row && newCol < col && grid[newRow][newCol] == '1'){
                                queue.add(new int[] {newRow,newCol});
                                grid[newRow][newCol] = '0';
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    // public static void dfs(char[][] grid,int i,int j){
    //     int row = grid.length;
    //     int col = grid[0].length;
    //     if(i<0 || j<0 || j>=col || i>=row || grid[i][j] == '0'){
    //         return;
    //     }
    //     grid[i][j]='0';
    //     dfs(grid, i-1,j);
    //     dfs(grid, i+1,j);
    //     dfs(grid, i,j-1);
    //     dfs(grid, i,j+1);
    // }
}