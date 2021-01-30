package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/30/21, Sat, 3:39 PM
 **/

//https://leetcode.com/problems/hamming-distance/
public class HammingDistance {

    /**
     * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
     * <p>
     * Given two integers x and y, calculate the Hamming distance.
     * <p>
     * Note:
     * 0 ≤ x, y < 231.
     * <p>
     * Example:
     * <p>
     * Input: x = 1, y = 4
     * <p>
     * Output: 2
     * <p>
     * Explanation:
     * 1   (0 0 0 1)
     * 4   (0 1 0 0)
     * ↑   ↑
     * <p>
     * The above arrows point to positions where the corresponding bits are different.
     *
     * @param x
     * @param y
     * @return the hamming distance
     */

    //Time Complexity = O(1)
    //Space Complexity = O(1)
    public int hammingDistance(int x, int y) {

        int res = x ^ y;
        int count = 0;
        while (res > 0) {
            count += (res & 1);
            res = res >> 1;
        }
        return count;
    }
}

