package Leetcode.SquaresOfSortedArray;

/**
 * @author : Sudeep Narkar
 * @since : 11/1/2020, Sun, 10:27 PM
 **/

//https://leetcode.com/problems/squares-of-a-sorted-array
class SquaresOfSortedArray {

    /**
     * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
     * Example 1:
     * <p>
     * Input: [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Example 2:
     * <p>
     * Input: [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     */

    public int[] sortedSquares(int[] A) {
        int[] sortedSquare = new int[A.length];
        int i = 0;
        int j = A.length - 1;
        int index = A.length - 1;
        while (i <= j) {
            int iNum = Math.abs(A[i]);
            int jNum = Math.abs(A[j]);
            if (iNum > jNum) {
                sortedSquare[index--] = iNum * iNum;
                i++;
            } else {
                sortedSquare[index--] = jNum * jNum;
                j--;
            }
        }

        return sortedSquare;
    }
}
