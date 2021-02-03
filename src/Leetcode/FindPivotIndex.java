package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/3/2021, Wed, 5:40 PM
 **/

//https://leetcode.com/problems/find-pivot-index
public class FindPivotIndex {

    /**
     * Given an array of integers nums, calculate the pivot index of this array.
     * <p>
     * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
     * <p>
     * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
     * <p>
     * Return the leftmost pivot index. If no such index exists, return -1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,7,3,6,5,6]
     * Output: 3
     * Explanation:
     * The pivot index is 3.
     * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
     * Right sum = nums[4] + nums[5] = 5 + 6 = 11
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1,2,3]
     * Output: -1
     * Explanation:
     * There is no index that satisfies the conditions in the problem statement.
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [2,1,-1]
     * Output: 0
     * Explanation:
     * The pivot index is 0.
     * Left sum = 0 (no elements to the left of index 0)
     * Right sum = nums[1] + nums[2] = 1 + -1 = 0
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -1000 <= nums[i] <= 1000
     *
     * @param nums
     * @return the pivot index
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(1)
    public int pivotIndex(int[] nums) {

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int sumLeft = 0;
        int sumRight = 0;
        int pivotIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            sumLeft += i == 0 ? 0 : nums[i - 1];
            sumRight = sum - (nums[i] + sumLeft);
            if (sumLeft == sumRight) {
                return i;
            }
        }
        return pivotIndex;
    }
}
