package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/29/21, Mon, 1:24 PM
 **/

//https://leetcode.com/problems/minimum-path-sum
public class MinimumPathSum {

    /**
     * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
     * <p>
     * Note: You can only move either down or right at any point in time.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
     * Output: 7
     * Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
     * Example 2:
     * <p>
     * Input: grid = [[1,2,3],[4,5,6]]
     * Output: 12
     *
     * @param grid
     * @return minimum path sum to reach bottom right cell of the matrix
     */

    //Time Complexity = O(M*N), where M and N are the number of rows and cols in the matrix
    //Space Complexity = O(M*N), where M and N are the number of rows and cols in the matrix
    public int minPathSum(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        //dp solution
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int[][] dp = new int[rowLen][colLen];

        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                dp[r][c] = grid[r][c];

                if (r > 0 && c > 0) {
                    //Min of sum from up or from the left as these are the only two ways to reach this point
                    dp[r][c] += Math.min(dp[r - 1][c], dp[r][c - 1]);
                } else if (r > 0) {
                    //If the col is 0
                    dp[r][c] += dp[r - 1][c];
                } else if (c > 0) {
                    //If the row is 0
                    dp[r][c] += dp[r][c - 1];
                }
            }
        }

        // The min path to reach any cell r,c is stored in dp[r][c]. In this case it is dp[rowLen-1][colLen-1]
        return dp[rowLen - 1][colLen - 1];
    }
}
