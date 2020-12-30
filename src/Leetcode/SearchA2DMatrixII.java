package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/29/20, Tue, 8:29 PM
 **/

//https://leetcode.com/problems/search-a-2d-matrix-ii
public class SearchA2DMatrixII {

    /**
     * Write an efficient algorithm that searches for a target value in an m x n integer matrix. The matrix has the following properties:
     * <p>
     * Integers in each row are sorted in ascending from left to right.
     * Integers in each column are sorted in ascending from top to bottom.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
     * Output: true
     * Example 2:
     * <p>
     * <p>
     * Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= n, m <= 300
     * -109 <= matix[i][j] <= 109
     * All the integers in each row are sorted in ascending order.
     * All the integers in each column are sorted in ascending order.
     * -109 <= target <= 109
     *
     * @param matrix
     * @param target
     * @return
     */

    // Time Complexity = O(rowLen + colLen)
    // Space Complexity = O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int row = 0;
        int col = colLen - 1;
        while (row < rowLen && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target > matrix[row][col]) {
                row = row + 1;
            } else {
                col = col - 1;
            }
        }
        return false;
    }
}
