package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author : Sudeep Narkar
 * @since : 10/28/2020, Wed, 8:36 AM
 **/


//https://leetcode.com/problems/intersection-of-two-arrays/
public class Intersection {

    /**
     * Given two arrays, write a function to compute their intersection.
     * <p>
     * Example 1:
     * <p>
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2]
     * Example 2:
     * <p>
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [9,4]
     */

    //Time Complexity = O(N+M), where N is the length of nums1 and M is the length of nums2
    //Time Complexity = O(N+M), where N is the length of nums1 and M is the length of nums2
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }
        int size = list.size();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
