package Leetcode;

public class FindPeakElement {

   /* A peak element is an element that is greater than its neighbors.

    Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

    The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

    You may imagine that nums[-1] = nums[n] = -∞.

    Example 1:

    Input: nums = [1,2,3,1]
    Output: 2
    Explanation: 3 is a peak element and your function should return the index number 2.
    Example 2:

    Input: nums = [1,2,1,3,5,6,4]
    Output: 1 or 5
    Explanation: Your function can return either index number 1 where the peak element is 2,
    or index number 5 where the peak element is 6.
    */


    public static int findPeakElement(int[] nums) {

        if (nums.length < 2) {
            return 0;
        }

        int index = -1;
        if (nums.length == 2) {
            return (nums[0] > nums[1]) ? 0 : 1;
        }
        boolean ascSorted = false;
        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i - 1] < nums[i]) {
                ascSorted = true;
            }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return ascSorted == true ? nums.length - 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(findPeakElement(arr));

    }
}
