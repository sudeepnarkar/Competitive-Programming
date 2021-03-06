package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 3/6/21, Sat, 4:21 PM
 **/

//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {

    /**
     * Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.
     * <p>
     * Follow up:
     * <p>
     * A straight forward solution using O(mn) space is probably a bad idea.
     * A simple improvement uses O(m + n) space, but still not the best solution.
     * Could you devise a constant space solution?
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[1,0,1],[0,0,0],[1,0,1]]
     * Example 2:
     * <p>
     * <p>
     * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
     * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * m == matrix.length
     * n == matrix[0].length
     * 1 <= m, n <= 200
     * -231 <= matrix[i][j] <= 231 - 1
     *
     * @param matrix
     */

    //Time Complexity = O(M*N), M = rows, N = cols
    //Space Complexity = O(M+N), For thr rows and cols set
    public void setZeroes1(int[][] matrix) {

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();


        for (int r = 0; r < matrix.length; ++r) {
            for (int c = 0; c < matrix[0].length; ++c) {
                if (matrix[r][c] == 0) {
                    //store the row and col that needs to set to 0
                    rowSet.add(r);
                    colSet.add(c);
                }
            }
        }

        for (int r = 0; r < matrix.length; ++r) {
            for (int c = 0; c < matrix[0].length; ++c) {
                //Check if the cell needs to be set to zero
                if (rowSet.contains(r) || colSet.contains(c)) {
                    matrix[r][c] = 0;
                }
            }
        }
    }

    //Time Complexity = O(M*N), M = rows, N = cols
    //Space Complexity = O(1)
    public void setZeroes2(int[][] matrix) {

        boolean firstRow = false;
        boolean firstCol = false;

        for (int r = 0; r < matrix.length; r++) {

            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    //Set the flag for first row and first cols
                    if (r == 0) {
                        firstRow = true;
                    }
                    if (c == 0) {
                        firstCol = true;
                    }
                    //set the state of each row in the first row and store the state of each col in the first of that col
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                }
            }
        }

        for (int r = 1; r < matrix.length; r++) {
            for (int c = 1; c < matrix[0].length; c++) {
                //check the state of that row and col, if set as 0 then set the current cell as 0
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        //check if first row or cols should be set to 0
        if (firstRow) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[0][c] = 0;

            }
        }

        if (firstCol) {
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][0] = 0;

            }
        }
    }
}
