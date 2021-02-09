package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/8/2021, Mon, 7:39 PM
 **/

//https://leetcode.com/problems/matrix-diagonal-sum
public class MatrixDiagonalSum {

    /**
     * Given a square matrix mat, return the sum of the matrix diagonals.
     * <p>
     * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: mat = [[1,2,3],
     * [4,5,6],
     * [7,8,9]]
     * Output: 25
     * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
     * Notice that element mat[1][1] = 5 is counted only once.
     * <p>
     * Example 2:
     * <p>
     * Input: mat = [[1,1,1,1],
     * [1,1,1,1],
     * [1,1,1,1],
     * [1,1,1,1]]
     * Output: 8
     * <p>
     * Example 3:
     * <p>
     * Input: mat = [[5]]
     * Output: 5
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == mat.length == mat[i].length
     * 1 <= n <= 100
     * 1 <= mat[i][j] <= 100
     *
     * @param mat
     * @return the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
     */

    //Time Complexity = O(N^2), where N is the length of rows and colums
    //Space Complexity = O(1)
    public int diagonalSum(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;
        int sum = 0;
        for (int r = 0; r < rows; r++) {
            //sum of right diagonal
            sum += mat[r][cols - r - 1];
            for (int c = 0; c < cols; c++) {
                //sum of left diagonal
                if (r == c) {
                    sum += mat[r][c];
                }
            }
        }
        //If N is odd, deduct the duplicate count
        return rows % 2 == 1 ? sum - mat[rows / 2][cols / 2] : sum;
    }
}
