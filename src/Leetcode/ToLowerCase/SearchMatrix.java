package Leetcode.ToLowerCase;

public class SearchMatrix {

   /* Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the previous row.
    Example 1:

    Input:
    matrix = [
            [1,   3,  5,  7],
            [10, 11, 16, 20],
            [23, 30, 34, 50]
            ]
    target = 3
    Output: true
    Example 2:

    Input:
    matrix = [
            [1,   3,  5,  7],
            [10, 11, 16, 20],
            [23, 30, 34, 50]
            ]
    target = 13
    Output: false

    */

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        if(m == 0){
            return false;
        }
        int n = matrix[0].length;

        int row = m-1;
        int col = 0;
        boolean res = false;

        while(row>-1 && col<n){
            if(matrix[row][col] == target){
                res = true;
                break;
            } else if (matrix[row][col] < target){
                col++;
            }else{
                row--;
            }
        }
        return res;
    }
}
