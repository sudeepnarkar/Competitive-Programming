package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 11/14/2020, Sat, 10:14 PM
 **/

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    /**
     * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
     * <p>
     * Return the answer in an array.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [8,1,2,2,3]
     * Output: [4,0,1,1,3]
     * Explanation:
     * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
     * For nums[1]=1 does not exist any smaller number than it.
     * For nums[2]=2 there exist one smaller number than it (1).
     * For nums[3]=2 there exist one smaller number than it (1).
     * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [6,5,4,8]
     * Output: [2,1,0,3]
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [7,7,7,7]
     * Output: [0,0,0,0]
     */


    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();

        int[] copy = nums.clone();

        Arrays.sort(copy);

        for (int i = 0; i < copy.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = map.get(nums[i]);
        }

        return res;
    }
}
