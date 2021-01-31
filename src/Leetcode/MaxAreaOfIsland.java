package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/31/21, Sun, 2:13 PM
 **/

//https://leetcode.com/problems/max-area-of-island
public class MaxAreaOfIsland {

    /**
     * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
     * <p>
     * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
     * <p>
     * Example 1:
     * <p>
     * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
     * [0,0,0,0,0,0,0,1,1,1,0,0,0],
     * [0,1,1,0,1,0,0,0,0,0,0,0,0],
     * [0,1,0,0,1,1,0,0,1,0,1,0,0],
     * [0,1,0,0,1,1,0,0,1,1,1,0,0],
     * [0,0,0,0,0,0,0,0,0,0,1,0,0],
     * [0,0,0,0,0,0,0,1,1,1,0,0,0],
     * [0,0,0,0,0,0,0,1,1,0,0,0,0]]
     * Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
     * Example 2:
     * <p>
     * [[0,0,0,0,0,0,0,0]]
     * Given the above grid, return 0.
     * Note: The length of each dimension in the given grid does not exceed 50.
     *
     * @param grid
     * @return max area of the Island
     */

    //Time Complexity = O(R*C), where R is the number of rows and C is the number of columns
    //Space Complexity = O(R*C)(counting recursion stack), where R is the number of rows and C is the number of columns
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        int area = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    area = numIslandsUtil(grid, r, c);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;

    }

    public int numIslandsUtil(int[][] grid, int r, int c) {

        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        int area = 1;
        area += numIslandsUtil(grid, r - 1, c);
        area += numIslandsUtil(grid, r, c - 1);
        area += numIslandsUtil(grid, r + 1, c);
        area += numIslandsUtil(grid, r, c + 1);
        return area;
    }
}
