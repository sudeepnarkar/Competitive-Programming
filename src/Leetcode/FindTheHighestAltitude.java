package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/23/2021, Sat, 5:15 PM
 **/

//https://leetcode.com/problems/find-the-highest-altitude
public class FindTheHighestAltitude {

    /**
     * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
     * <p>
     * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: gain = [-5,1,5,0,-7]
     * Output: 1
     * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
     * <p>
     * Example 2:
     * <p>
     * Input: gain = [-4,-3,-2,-1,4,3,2]
     * Output: 0
     * Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == gain.length
     * 1 <= n <= 100
     * -100 <= gain[i] <= 100
     *
     * @param gain
     * @return
     */


    //Time Complexity = O(N), where N is the length of array
    //Time Complexity = O(1)
    public int largestAltitude(int[] gain) {

        int maxHeight = 0;
        int height = 0;
        for (int n : gain) {
            height += n;
            maxHeight = Math.max(height, maxHeight);
        }
        return maxHeight;
    }
}
