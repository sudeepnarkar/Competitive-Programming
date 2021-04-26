package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 4/25/21, Sun, 9:54 PM
 **/

//https://leetcode.com/problems/missing-number
public class MissingNumber {

    /**
     * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
     * <p>
     * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [3,0,1]
     * Output: 2
     * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
     * Example 2:
     * <p>
     * Input: nums = [0,1]
     * Output: 2
     * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
     * Example 3:
     * <p>
     * Input: nums = [9,6,4,2,3,5,7,0,1]
     * Output: 8
     * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
     * Example 4:
     * <p>
     * Input: nums = [0]
     * Output: 1
     * Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in nums.
     *
     * @param nums
     * @return
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(1)
    public int missingNumber(int[] nums) {

        //Arithmetic Progression sum
        long expectedSum = (nums.length * (nums.length + 1)) / 2;
        long actualSum = 0;
        for (int n : nums) {
            actualSum += n;
        }
        return (int) (expectedSum - actualSum);
    }
}
