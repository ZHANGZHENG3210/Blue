package Test;

public class Permutation {
    public int numIslands(char[][] grid) {
        int res = 0 ;
        for(int i = 0 ; i < grid.length ; i ++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] == '1') //找到为1的陆地，调用DFS使之变成大海
                {
                    res ++ ; //记录调用的次数
                    dfs(i,j,grid) ;
                }
            }
        }
        return res ;
    }
    public void dfs(int i , int j ,char[][] grid)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1')
            return ;
        grid[i][j] = '0' ;
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
    }
}
