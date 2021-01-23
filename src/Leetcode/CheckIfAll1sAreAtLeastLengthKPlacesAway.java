package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/19/2020, Mon, 8:29 PM
 **/

//https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
public class CheckIfAll1sAreAtLeastLengthKPlacesAway {

    /**
     * Given an array nums of 0s and 1s and an integer k, return True if all 1's are at least k places away from each other, otherwise return False.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,0,0,0,1,0,0,1], k = 2
     * Output: true
     * Explanation: Each of the 1s are at least 2 places away from each other.
     * Example 2:
     * <p>
     * Input: nums = [1,0,0,1,0,1], k = 2
     * Output: false
     * Explanation: The second 1 and third 1 are only one apart from each other.
     * Example 3:
     * <p>
     * Input: nums = [1,1,1,1,1], k = 0
     * Output: true
     * Example 4:
     * <p>
     * Input: nums = [0,1,0,1], k = 1
     * Output: true
     */

    //Time Complexity = O(N)
    //Space Complexity = O(1)
    public boolean kLengthApart(int[] nums, int k) {
        int index = 0;
        boolean firstOne = false;
        for (int start = -1, i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (start != -1 && (i - start) <= k) {
                    return false;
                }
                start = i;
            }
        }
        return true;
    }
}
