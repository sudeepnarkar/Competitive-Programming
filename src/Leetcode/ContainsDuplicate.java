package Leetcode;

import java.util.HashSet;

/**
 * @author : Sudeep Narkar
 * @since : 4/19/21, Mon, 10:27 PM
 **/

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {

    /**
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,1]
     * Output: true
     * Example 2:
     * <p>
     * Input: nums = [1,2,3,4]
     * Output: false
     * Example 3:
     * <p>
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     *
     * @param nums
     * @return eturn true if any value appears at least twice in the array, and return false if every element is distinct.
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(N), where N is the length of nums
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
