package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/24/2021, Sun, 9:21 AM
 **/

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range
public class CountOddNumbersInAnIntervalRange {


    /**
     * Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: low = 3, high = 7
     * Output: 3
     * Explanation: The odd numbers between 3 and 7 are [3,5,7].
     * <p>
     * Example 2:
     * <p>
     * Input: low = 8, high = 10
     * Output: 1
     * Explanation: The odd numbers between 8 and 10 are [9].
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= low <= high <= 10^9
     *
     * @param low
     * @param high
     * @return count of odd numbers between low and high (inclusive).
     */

    //Time Complexity = O(1)
    //Space Complexity = O(1)
    public int countOdds(int low, int high) {

        //If the low and high is even, take the difference divided by 2
        // Else take the difference divided by 2 plus 1
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        } else {
            return (high - low) / 2 + 1;
        }
    }
}
