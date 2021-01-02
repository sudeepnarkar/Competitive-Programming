package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/2/2021, Sat, 6:25 PM
 **/

//https://leetcode.com/problems/search-a-2d-matrix
public class SearchA2DMatrix {

    /**
     * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
     * <p>
     * Integers in each row are sorted from left to right.
     * The first integer of each row is greater than the last integer of the previous row.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     * Output: true
     * Example 2:
     * <p>
     * <p>
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 100
     * -104 <= matrix[i][j], target <= 104
     *
     * @param matrix
     * @param target
     * @return true if target is present or return false
     */

    // Time Complexity = O(LogN), where N is the total number of elements (NRows*NCols) in the matrix
    // Space Complexity = O(1)
    public boolean searchMatrix(int[][] matrix, int target) {


        int nRows = matrix.length;
        int nCols = matrix[0].length;

        // considering the matrix as a ordered list
        int low = 0;
        int high = (nRows * nCols) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // row = mid/nCols
            // col = mid%nCols
            int midVal = matrix[mid / nCols][mid % nCols];
            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
