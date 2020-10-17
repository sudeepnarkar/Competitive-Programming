package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/16/2020, Fri, 11:05 PM
 **/

public class NumberOfIslands {

    /**
     * Given an m x n 2d grid map of '1's (land) and '0's (water), return the number of islands.
     * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
     * You may assume all four edges of the grid are all surrounded by water.
     */

    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int maxIslands = 0;
        for (int i =0;i<m;i++){
            for (int j =0;j<n;j++){
                if (grid[i][j] == '1'){
                    maxIslands++;
                    dfs(i,j,grid);
                }
            }
        }
        return maxIslands;
    }


    public void dfs(int r, int c, char [][] grid){

        if(r>=grid.length || c>= grid[0].length || r<0 || c<0 || grid[r][c] == '0'){
            return;
        }

        grid [r][c] = '0';
        dfs(r,c-1,grid);
        dfs(r,c+1,grid);
        dfs(r-1,c,grid);
        dfs(r+1,c,grid);
        return;
    }
}
