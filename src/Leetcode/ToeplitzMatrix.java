package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/15/2020, Tue, 6:54 PM
 **/

//https://leetcode.com/problems/toeplitz-matrix
public class ToeplitzMatrix {


    /**
     * Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
     * <p>
     * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
     * Output: true
     * Explanation:
     * In the above grid, the diagonals are:
     * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
     * In each diagonal all elements are the same, so the answer is True.
     * Example 2:
     * <p>
     * <p>
     * Input: matrix = [[1,2],[2,2]]
     * Output: false
     * Explanation:
     * The diagonal "[1, 2]" has different elements.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 20
     * 0 <= matrix[i][j] <= 99
     * <p>
     * <p>
     * Follow up:
     * <p>
     * What if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once?
     * What if the matrix is so large that you can only load up a partial row into the memory at once?
     *
     * @param matrix
     * @return
     */

    // Time Complexity = O(M*N) where M is rowLen and N is colLen
    // Space Complexity = O(1)
    public boolean isToeplitzMatrix(int[][] matrix) {

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        // check if each value is equal to the value of it's top-left neighbor.
        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
