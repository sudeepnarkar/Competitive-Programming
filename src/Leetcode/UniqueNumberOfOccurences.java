package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 11/2/2020, Mon, 7:24 PM
 **/

//https://leetcode.com/problems/unique-number-of-occurrences
public class UniqueNumberOfOccurences {

    /**
     * Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: arr = [1,2,2,1,1,3]
     * Output: true
     * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
     * Example 2:
     * <p>
     * Input: arr = [1,2]
     * Output: false
     * Example 3:
     * <p>
     * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
     * Output: true
     */

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> values = new HashSet<>();
        for (int num : map.values()) {
            if (values.contains(num)) {
                return false;
            }
            values.add(num);
        }
        return true;
    }
}
