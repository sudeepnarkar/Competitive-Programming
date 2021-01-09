package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/3/2020, Tue, 16:36 PM
 **/

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
public class TwoSumInputArrayIsSorted {

    /**
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
     * <p>
     * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
     * <p>
     * Note:
     * <p>
     * Your returned answers (both index1 and index2) are not zero-based.
     * You may assume that each input would have exactly one solution and you may not use the same element twice.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
     * <p>
     * Example 2:
     * <p>
     * Input: numbers = [2,3,4], target = 6
     * Output: [1,3]
     * <p>
     * Example 3:
     * <p>
     * Input: numbers = [-1,0], target = -1
     * Output: [1,2]
     */

    //Time Complexity = O(LogN), where N is the length of numbers
    //Space Complexity = O(1)
    public int[] twoSum(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }
        return new int[]{-1, -1};
    }
}
