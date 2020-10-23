package Leetcode.NumberDisappearedInArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 10/23/2020, Thu, 7:08 AM
 **/

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
public class NumberDisappearedInArray {


    /**
     * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
     * <p>
     * Find all the elements of [1, n] inclusive that do not appear in this array.
     * <p>
     * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
     * <p>
     * Example:
     * <p>
     * Input:
     * [4,3,2,7,8,2,3,1]
     * <p>
     * Output:
     * [5,6]
     */


    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;

    }
}
