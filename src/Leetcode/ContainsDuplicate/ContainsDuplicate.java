package Leetcode.ContainsDuplicate;

import java.util.HashSet;

/**
 * @author : Sudeep Narkar
 * @since : 11/10/2020, Tue, 6:47 AM
 **/

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {


    /**
     * Given an array of integers, find if the array contains any duplicates.
     * <p>
     * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
     * <p>
     * Example 1:
     * <p>
     * Input: [1,2,3,1]
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input: [1,2,3,4]
     * Output: false
     * <p>
     * Example 3:
     * <p>
     * Input: [1,1,1,3,3,4,3,2,4,2]
     * Output: true
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
