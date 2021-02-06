import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 2/6/2021, Sat, 5:16 PM
 **/

//https://leetcode.com/problems/sum-of-unique-elements
public class SumOfUniqueElements {

    /**
     * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
     * <p>
     * Return the sum of all the unique elements of nums.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,2]
     * Output: 4
     * Explanation: The unique elements are [1,3], and the sum is 4.
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1,1,1,1,1]
     * Output: 0
     * Explanation: There are no unique elements, and the sum is 0.
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [1,2,3,4,5]
     * Output: 15
     * Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 100
     *
     * @param nums
     * @return the sum of all the unique elements of nums.
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(N), where N is the length of nums
    public int sumOfUnique(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
