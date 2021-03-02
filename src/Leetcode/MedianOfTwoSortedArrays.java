package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/1/21, Mon, 8:53 PM
 **/

//https://leetcode.com/problems/median-of-two-sorted-arrays
public class MedianOfTwoSortedArrays {

    /**
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums1 = [1,3], nums2 = [2]
     * Output: 2.00000
     * Explanation: merged array = [1,2,3] and median is 2.
     * Example 2:
     * <p>
     * Input: nums1 = [1,2], nums2 = [3,4]
     * Output: 2.50000
     * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     * Example 3:
     * <p>
     * Input: nums1 = [0,0], nums2 = [0,0]
     * Output: 0.00000
     * Example 4:
     * <p>
     * Input: nums1 = [], nums2 = [1]
     * Output: 1.00000
     * Example 5:
     * <p>
     * Input: nums1 = [2], nums2 = []
     * Output: 2.00000
     * <p>
     * <p>
     * Constraints:
     * <p>
     * nums1.length == m
     * nums2.length == n
     * 0 <= m <= 1000
     * 0 <= n <= 1000
     * 1 <= m + n <= 2000
     * -106 <= nums1[i], nums2[i] <= 106
     * <p>
     * <p>
     * Follow up: The overall run time complexity should be O(log (m+n)).
     *
     * @param nums1
     * @param nums2
     * @return the median of the two sorted arrays
     */

    //Time Complexity = O(N+M), where N and M is the length of nums1 and nums2 respectively
    //Space Complexity = O(N+M), where N and M is the length of nums1 and nums2 respectively
    //TODO: Optimize the solution for O(Log(M+N))
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = (nums1.length + nums2.length);
        int i = 0;
        int j = 0;
        int[] resArr = new int[nums1.length + nums2.length];
        int index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                resArr[index] = nums1[i];
                i++;
            } else {
                resArr[index] = nums2[j];
                j++;
            }
            index++;
        }

        while (i < nums1.length) {
            resArr[index] = nums1[i];
            i++;
            index++;
        }


        while (j < nums2.length) {
            resArr[index] = nums2[j];
            j++;
            index++;
        }
        double median = 0;
        if (len % 2 == 1) {
            median = resArr[len / 2];
        } else {
            median = (double) (resArr[len / 2] + resArr[(len / 2) - 1]) / 2;
        }
        return median;
    }
}
