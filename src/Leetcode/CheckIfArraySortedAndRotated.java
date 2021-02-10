package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/10/2021, Wed, 8:52 AM
 **/

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated
public class CheckIfArraySortedAndRotated {

    /**
     * Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
     * <p>
     * There may be duplicates in the original array.
     * <p>
     * Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [3,4,5,1,2]
     * Output: true
     * Explanation: [1,2,3,4,5] is the original sorted array.
     * You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [2,1,3,4]
     * Output: false
     * Explanation: There is no sorted array once rotated that can make nums.
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [1,2,3]
     * Output: true
     * Explanation: [1,2,3] is the original sorted array.
     * You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
     * <p>
     * Example 4:
     * <p>
     * Input: nums = [1,1,1]
     * Output: true
     * Explanation: [1,1,1] is the original sorted array.
     * You can rotate any number of positions to make nums.
     * <p>
     * Example 5:
     * <p>
     * Input: nums = [2,1]
     * Output: true
     * Explanation: [1,2] is the original sorted array.
     * You can rotate the array by x = 5 positions to begin on the element of value 2: [2,1].
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 100
     *
     * @param A
     * @return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
     */

    //Time Complexity = O(N), where N is the length of A
    //Space Complexity = O(1)
    public boolean check(int[] A) {

        int count = 0;
        int len = A.length;
        for (int i = 0; i < A.length; i++) {
            //compare current and next element in a rotated sorted array
            if (A[i] > A[(i + 1) % len]) {
                count++;
                //count can be at most one
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
