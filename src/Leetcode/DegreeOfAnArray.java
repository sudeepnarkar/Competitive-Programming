package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 2/17/21, Wed, 6:11 PM
 **/

//https://leetcode.com/problems/degree-of-an-array
public class DegreeOfAnArray {

    /**
     * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
     * <p>
     * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,2,3,1]
     * Output: 2
     * Explanation:
     * The input array has a degree of 2 because both elements 1 and 2 appear twice.
     * Of the subarrays that have the same degree:
     * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
     * The shortest length is 2. So return 2.
     * Example 2:
     * <p>
     * Input: nums = [1,2,2,3,1,4,2]
     * Output: 6
     * Explanation:
     * The degree is 3 because the element 2 is repeated 3 times.
     * So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
     *
     * @param nums
     * @return smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
     */

    //Time Complexity = O(N), where N is the length of array nums
    //Space Complexity = O(N), where N is the length of array nums
    public int findShortestSubArray(int[] nums) {

        if (nums == null || nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int degree = 0;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > degree) {
                degree = map.get(n);
            }
        }

        if (degree == 1) {
            return 1;
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == degree) {
                list.add(e.getKey());
            }
        }

        int minLenSubArray = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            int low = 0;
            int high = nums.length - 1;
            int first = -1;
            int last = -1;
            boolean firstFound = false;
            boolean lastFound = false;
            while (low < nums.length || high >= 0) {
                if (nums[low] == n && !firstFound) {
                    first = low;
                    firstFound = true;
                }
                if (nums[high] == n && !lastFound) {
                    last = high;
                    lastFound = true;
                }
                if (first != -1 && last != -1) {
                    break;
                }
                low++;
                high--;
            }

            minLenSubArray = Math.min(minLenSubArray, (last - first) + 1);
        }
        return minLenSubArray;
    }
}
