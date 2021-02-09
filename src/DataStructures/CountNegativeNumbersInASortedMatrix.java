package DataStructures;

/**
 * @author : Sudeep Narkar
 * @since : 2/8/2021, Mon, 7:17 PM
 **/

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix
public class CountNegativeNumbersInASortedMatrix {

    /**
     * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
     * Output: 8
     * Explanation: There are 8 negatives number in the matrix.
     * <p>
     * Example 2:
     * <p>
     * Input: grid = [[3,2],[1,0]]
     * Output: 0
     * <p>
     * Example 3:
     * <p>
     * Input: grid = [[1,-1],[-1,-1]]
     * Output: 3
     * <p>
     * Example 4:
     * <p>
     * Input: grid = [[-1]]
     * Output: 1
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * m == grid.length
     * n == grid[i].length
     * 1 <= m, n <= 100
     * -100 <= grid[i][j] <= 100
     *
     * @param grid
     * @return count of negative numbers in the matrix
     */

    //Time Complexity = O(N+M), where N is the number of rows and M is the number of columns
    // Space Complexity = O(1)
    public int countNegatives(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int r = 0;
        int c = cols - 1;
        int count = 0;

        // start from the top right corner
        while (r < rows && c >= 0) {
            if (grid[r][c] < 0) {
                //count all elements in the column based on property of matrix
                count += rows - r;
                //check previous colums
                c--;
            } else {
                //check next row
                r++;
            }
        }
        return count;
    }
}
