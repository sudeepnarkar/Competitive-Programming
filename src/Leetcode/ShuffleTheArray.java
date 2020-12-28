package Leetcode;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * @author : Sudeep Narkar
 * @since : 12/25/2020, Fri, 5:24 PM
 **/

//https://leetcode.com/problems/shuffle-the-array
public class ShuffleTheArray {

    /**
     * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
     * <p>
     * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,5,1,3,4,7], n = 3
     * Output: [2,3,5,4,1,7]
     * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
     * Example 2:
     * <p>
     * Input: nums = [1,2,3,4,4,3,2,1], n = 4
     * Output: [1,4,2,3,3,2,4,1]
     * Example 3:
     * <p>
     * Input: nums = [1,1,2,2], n = 2
     * Output: [1,2,1,2]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 500
     * nums.length == 2n
     * 1 <= nums[i] <= 10^3
     *
     * @param nums
     * @param n
     * @return Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */

    //  Time Complexity = O(N) where N is the length of nums array
    //  Space Complexity = O(1)
    // TODO: 12/25/2020 Need to optimize the solution to eliminate redundant index variable usage.
    public int[] shuffle(int[] nums, int n) {

        int index2 = n;
        int index1 = 0;
        int[] res = new int[nums.length];
        int index = 0;
        while (index2 < nums.length) {
            res[index++] = nums[index1];
            res[index++] = nums[index2];
            index1++;
            index2++;
        }
        return res;
    }
}
