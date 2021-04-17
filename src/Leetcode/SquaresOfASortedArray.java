package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 4/17/2021, Sat, 10:06 AM
 **/

//https://leetcode.com/problems/squares-of-a-sorted-array
public class SquaresOfASortedArray {

    /**
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums is sorted in non-decreasing order.
     * <p>
     * <p>
     * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
     *
     * @param A
     * @return an array of the squares of each number sorted in non-decreasing order.
     */

    //Time Complexity = O(N), where N is the len of A
    //Space Complexity = O(N), where N is the len of A
    public int[] sortedSquares(int[] A) {

        int[] sortedSquare = new int[A.length];
        int low = 0;
        int high = A.length - 1;
        int index = A.length - 1;
        while (low <= high) {
            int lowNumAbs = Math.abs(A[low]);
            int highNumAbs = Math.abs(A[high]);
            if (lowNumAbs > highNumAbs) {
                sortedSquare[index--] = lowNumAbs * lowNumAbs;
                low++;
            } else {
                sortedSquare[index--] = highNumAbs * highNumAbs;
                high--;
            }
        }
        return sortedSquare;
    }
}
