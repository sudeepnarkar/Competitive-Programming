package Leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array
public class FindDuplicates {

    /**
     * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
     * <p>
     * Find all the elements that appear twice in this array.
     * <p>
     * Could you do it without extra space and in O(n) runtime?
     * <p>
     * Example:
     * Input:
     * [4,3,2,7,8,2,3,1]
     * <p>
     * Output:
     * [2,3]
     *
     * @param nums
     * @return List of integer consisting of elements that appear twice
     */

    // Time Complexity = O(N), where N is the length of nums
    // Time Complexity = O(N/2), where N is the length of nums
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] < 0) {
                list.add(index);
            } else {
                nums[index - 1] = -nums[index - 1];
            }
        }
        return list;
    }
}
