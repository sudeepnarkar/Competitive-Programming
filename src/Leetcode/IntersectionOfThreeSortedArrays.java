package Leetcode;

import java.util.*;

/**
 * @author : Sudeep Narkar
 * @since : 2/7/21, Sun, 10:08 PM
 **/

//https://leetcode.com/problems/intersection-of-three-sorted-arrays
public class IntersectionOfThreeSortedArrays {

    /**
     * Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of only the integers that appeared in all three arrays.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
     * Output: [1,5]
     * Explanation: Only 1 and 5 appeared in the three arrays.
     * Example 2:
     * <p>
     * Input: arr1 = [197,418,523,876,1356], arr2 = [501,880,1593,1710,1870], arr3 = [521,682,1337,1395,1764]
     * Output: []
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= arr1.length, arr2.length, arr3.length <= 1000
     * 1 <= arr1[i], arr2[i], arr3[i] <= 2000
     *
     * @param arr1
     * @param arr2
     * @param arr3
     * @return the sorted result of common elements in the three arrays
     */


    //Time Complexity =  O(N), where N is the total length of all inputs
    //Space Complexity = O(N), where N is the total length of all inputs
    //TODO: Optimize the solution with two pointer approach
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : arr2) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : arr3) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int k : map.keySet()) {
            if (map.get(k) == 3) {
                list.add(k);
            }
        }
        Collections.sort(list);
        return list;
    }
}
