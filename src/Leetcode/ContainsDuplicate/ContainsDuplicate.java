package Leetcode.ContainsDuplicate;

import java.util.Arrays;

public class ContainsDuplicate {


    /*Given an array of integers, find if the array contains any duplicates.

    Your function should return true if any value appears at least twice in
    the array, and it should return false if every element is distinct.

    Example 1:

    Input: [1,2,3,1]
    Output: true*/


    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
