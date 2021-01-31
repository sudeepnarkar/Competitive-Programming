package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/30/21, Sat, 9:31 PM
 **/

//https://leetcode.com/problems/single-number-ii
public class SingleNumber2 {

    /**
     * Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,2,3,2]
     * Output: 3
     * Example 2:
     * <p>
     * Input: nums = [0,1,0,1,0,1,99]
     * Output: 99
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 3 * 104
     * -231 <= nums[i] <= 231 - 1
     * Each element in nums appears exactly three times except for one element which appears once.
     * <p>
     * <p>
     * Follow up: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     *
     * @param nums
     * @return
     */


    //Time Complexity = O(1)
    //Space Complexity = O(1)
    public int singleNumber(int[] nums) {

        int ones = 0;
        int twoes = 0;
        for (int n : nums) {
            ones = ~twoes & (ones ^ n);
            twoes = ~ones & (twoes ^ n);
        }
        return ones;
    }
}
