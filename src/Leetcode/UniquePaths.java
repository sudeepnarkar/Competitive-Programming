package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/12/2020, Sat, 5:40 PM
 **/

//https://leetcode.com/problems/unique-paths
public class UniquePaths {

    /**
     * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
     * <p>
     * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
     * <p>
     * How many possible unique paths are there?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: m = 3, n = 7
     * Output: 28
     * Example 2:
     * <p>
     * Input: m = 3, n = 2
     * Output: 3
     * Explanation:
     * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
     * 1. Right -> Down -> Down
     * 2. Down -> Down -> Right
     * 3. Down -> Right -> Down
     * Example 3:
     * <p>
     * Input: m = 7, n = 3
     * Output: 28
     * Example 4:
     * <p>
     * Input: m = 3, n = 3
     * Output: 6
     *
     * @param m
     * @param n
     * @return number of all possible unique paths
     */

    // Time Complexity = O (m*n) (To fill the dp matrix)
    // Space Complexity = O (m*n) (Space for the dp matrix)
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // fill 1 in all rows of col 0 as there is only 1 way of getting there
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // fill 1 in all cols of row 0 as there is only 1 way of getting there
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
