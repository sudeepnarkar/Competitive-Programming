package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/4/2021, Mon, 10:25 PM
 **/

//https://leetcode.com/problems/number-of-good-pairs
public class NumberOfGoodPairs {

    /**
     * Given an array of integers nums.
     * <p>
     * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
     * <p>
     * Return the number of good pairs.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,1,1,3]
     * Output: 4
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     * Example 2:
     * <p>
     * Input: nums = [1,1,1,1]
     * Output: 6
     * Explanation: Each pair in the array are good.
     * Example 3:
     * <p>
     * Input: nums = [1,2,3]
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 100
     *
     * @param nums
     * @return
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(1)
    public int numIdenticalPairs(int[] nums) {

        int count = 0;

        // Constraints:
        //1 <= nums[i] <= 100
        int[] arr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            count += arr[nums[i]]++;
        }
        return count;
    }
}
