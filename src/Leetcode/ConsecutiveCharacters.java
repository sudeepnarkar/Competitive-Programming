package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/13/2021, Wed, 9:11 PM
 **/

//https://leetcode.com/problems/consecutive-characters
public class ConsecutiveCharacters {

    /**
     * Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.
     * <p>
     * Return the power of the string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "leetcode"
     * Output: 2
     * Explanation: The substring "ee" is of length 2 with the character 'e' only.
     * <p>
     * Example 2:
     * <p>
     * Input: s = "abbcccddddeeeeedcba"
     * Output: 5
     * Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
     * <p>
     * Example 3:
     * <p>
     * Input: s = "triplepillooooow"
     * Output: 5
     * <p>
     * Example 4:
     * <p>
     * Input: s = "hooraaaaaaaaaaay"
     * Output: 11
     * <p>
     * Example 5:
     * <p>
     * Input: s = "tourist"
     * Output: 1
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 500
     * s contains only lowercase English letters.
     *
     * @param s
     * @return the power of the string.
     */

    //Time Complexity = O(N), where N is the length of S
    //Space Complexity = O(1)
    public int maxPower(String s) {

        int max = 1;
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }
}
