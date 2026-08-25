class Solution {
    public int numIslands(char[][] grid) {

        int result = 0;

        int row = grid.length;
        int col = grid[0].length;

        for(int i =0; i< row; i++){
            for(int j = 0; j<col; j++){
                if (grid[i][j] == '1'){
                    result+=1;
                    dfs(i, j, grid);
                }
            }
        }

        return result;
    }

    public void dfs(int i, int j, char[][]grid){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || (grid[i][j] == '0')){
            return;
        }
        grid[i][j] = '0';

        dfs(i + 1, j, grid);
        dfs(i - 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);
    }
}
