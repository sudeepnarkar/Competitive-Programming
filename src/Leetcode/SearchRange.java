package Leetcode;

public class SearchRange {

    /*Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

    Your algorithm's runtime complexity must be in the order of O(log n).

    If the target is not found in the array, return [-1, -1].

    Example 1:

    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Example 2:

    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]*/

    public int[] searchRange(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        boolean flag = false;

        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                flag = true;
                break;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (flag == true) {
            int midTemp = mid;
            int lowIndex = 0;
            int highIndex = 0;

            while (midTemp > -1 && nums[midTemp] == target) {
                lowIndex = midTemp;
                midTemp--;
            }
            while (mid < nums.length && nums[mid] == target) {
                highIndex = mid;
                mid++;
            }

            res[0] = lowIndex;
            res[1] = highIndex;
        }
        return res;
    }
}
