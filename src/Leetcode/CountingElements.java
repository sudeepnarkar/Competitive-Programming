package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 12/20/20, Sun, 10:46 PM
 **/

//https://leetcode.com/problems/counting-elements
public class CountingElements {

    /**
     * Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr.
     * <p>
     * If there're duplicates in arr, count them seperately.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: arr = [1,2,3]
     * Output: 2
     * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
     * Example 2:
     * <p>
     * Input: arr = [1,1,3,3,5,5,7,7]
     * Output: 0
     * Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
     * Example 3:
     * <p>
     * Input: arr = [1,3,2,3,5,0]
     * Output: 3
     * Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
     * Example 4:
     * <p>
     * Input: arr = [1,1,2,2]
     * Output: 2
     * Explanation: Two 1s are counted cause 2 is in arr.
     * Example 5:
     * <p>
     * Input: arr = [1,1,2]
     * Output: 2
     * Explanation: Both 1s are counted because 2 is in the array.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= arr.length <= 1000
     * 0 <= arr[i] <= 1000
     *
     * @param arr
     * @return
     */

    // Time Complexity = O(n)
    // Space Complexity = O(n)
    public int countElements(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }
        int count = 0;
        for (int n : arr) {
            if (set.contains(n + 1)) {
                count++;
            }
        }
        return count;
    }
}
