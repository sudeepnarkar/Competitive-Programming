package Leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {


    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     * <p>
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * <p>
     * Clarification:
     * <p>
     * Confused why the returned value is an integer but your answer is an array?
     * <p>
     * Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
     * <p>
     * Internally you can think of this:
     * <p>
     * // nums is passed in by reference. (i.e., without making a copy)
     * int len = removeDuplicates(nums);
     * <p>
     * // any modification to nums in your function would be known by the caller.
     * // using the length returned by your function, it prints the first len elements.
     * for (int i = 0; i < len; i++) {
     * print(nums[i]);
     * }
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2]
     * Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4]
     * Explanation: Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively. It doesn't matter what values are set beyond the returned length.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= nums.length <= 3 * 104
     * -104 <= nums[i] <= 104
     * nums is sorted in ascending order.
     *
     * @param nums
     * @return modified array by removing duplicates in-place such that each element appears only once and returns the new length.
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(1),
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int ind = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[ind++] = nums[i];
            }
        }
        nums[ind++] = nums[nums.length - 1];
        return ind;
    }
}
