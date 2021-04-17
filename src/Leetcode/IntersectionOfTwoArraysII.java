package Leetcode;

import java.util.ArrayList;

//https://leetcode.com/problems/intersection-of-two-arrays-ii
public class IntersectionOfTwoArraysII {


    /**
     * Given two arrays, write a function to compute their intersection.
     * <p>
     * Example 1:
     * <p>
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * <p>
     * Example 2:
     * <p>
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9]
     * <p>
     * Note:
     * <p>
     * Each element in the result should appear as many times as it shows in both arrays.
     * The result can be in any order.
     *
     * @param nums1
     * @param nums2
     * @return intersection of two arrays
     */

    // Time Complexity = O(N+M), where N and M are the lengths of N and M respectively
    // Space Complexity = O(N+M), where N and M are the lengths of N and M respectively
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> resList = new ArrayList<>();

        for (int n : nums1) {
            list.add(n);
        }

        for (int n : nums2) {
            if (list.contains(n)) {
                resList.add(n);
                list.remove(list.indexOf(n));
            }

        }
        int[] arr = resList.stream().mapToInt(i -> i).toArray();
        return arr;

    }
}
