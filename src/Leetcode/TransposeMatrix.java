package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/6/21, Sat, 2:25 PM
 **/

//https://leetcode.com/problems/transpose-matrix
public class TransposeMatrix {

    /**
     * Given a 2D integer array matrix, return the transpose of matrix.
     * <p>
     * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
     * <p>
     * <p>
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[1,4,7],[2,5,8],[3,6,9]]
     * Example 2:
     * <p>
     * Input: matrix = [[1,2,3],[4,5,6]]
     * Output: [[1,4],[2,5],[3,6]]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 1000
     * 1 <= m * n <= 105
     * -109 <= matrix[i][j] <= 109
     *
     * @param matrix
     * @return
     */

    //Time Complexity = O(M*N), where M is the number of rows and N is the number of cols
    //Space Complexity = O(M*N), where M is the number of rows and N is the number of cols
    public int[][] transpose(int[][] matrix) {

        int[][] resMatrix = new int[matrix[0].length][matrix.length];
        //Just copy matrix[r][c] to resMatrix[c][r]
        for (int r = 0; r < matrix.length; ++r) {
            for (int c = 0; c < matrix[0].length; ++c) {
                resMatrix[c][r] = matrix[r][c];
            }
        }
        return resMatrix;
    }
}
