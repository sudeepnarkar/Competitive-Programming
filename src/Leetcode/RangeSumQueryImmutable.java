package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/11/2021, Thu, 9:59 PM
 **/

//https://leetcode.com/problems/range-sum-query-immutable
public class RangeSumQueryImmutable {

    /**
     * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
     * <p>
     * Implement the NumArray class:
     * <p>
     * NumArray(int[] nums) Initializes the object with the integer array nums.
     * int sumRange(int i, int j) Return the sum of the elements of the nums array in the range [i, j] inclusive (i.e., sum(nums[i], nums[i + 1], ... , nums[j]))
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input
     * ["NumArray", "sumRange", "sumRange", "sumRange"]
     * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
     * Output
     * [null, 1, -1, -3]
     * <p>
     * Explanation
     * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
     * numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
     * numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
     * numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= nums.length <= 104
     * -105 <= nums[i] <= 105
     * 0 <= i <= j < nums.length
     * At most 104 calls will be made to sumRange.
     */


    //Time Complexity = O(N)
    //Space Complexity = O(N)
    int[] arr;

    public RangeSumQueryImmutable(int[] nums) {
        this.arr = nums;
        for (int i = 1; i < nums.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    //Time Complexity = O(1)
    //Space Complexity = O(N)
    public int sumRange(int i, int j) {
        if (i == 0) {
            return arr[j];
        }
        return arr[j] - arr[i - 1];
    }
}
