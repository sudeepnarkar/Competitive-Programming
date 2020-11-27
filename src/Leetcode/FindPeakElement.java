package Leetcode;

//https://leetcode.com/problems/find-peak-element
public class FindPeakElement {

    /**
     * A peak element is an element that is greater than its neighbors.
     * <p>
     * Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
     * <p>
     * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
     * <p>
     * You may imagine that nums[-1] = nums[n] = -∞.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,1]
     * Output: 2
     * Explanation: 3 is a peak element and your function should return the index number 2.
     * Example 2:
     * <p>
     * Input: nums = [1,2,1,3,5,6,4]
     * Output: 1 or 5
     * Explanation: Your function can return either index number 1 where the peak element is 2,
     * or index number 5 where the peak element is 6.
     *
     * @param nums
     * @return peak element index
     */


    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            } else {
                return i;
            }
        }
        return nums.length - 1;
    }

    // Binary serach finds the rightmost peak element in a array with multiple peak elements.
    // Since there is not restriction on which one can be returned, this can be a legit solution.
    public int findPeakElementBinarySearch(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = mid1 + 1;
            if (nums[mid1] < nums[mid2]) {
                low = mid2;
            } else {
                high = mid1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(findPeakElement(arr));
    }
}
