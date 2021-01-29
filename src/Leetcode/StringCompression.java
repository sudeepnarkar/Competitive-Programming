package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/29/2021, Fri, 4:34 PM
 **/

//https://leetcode.com/problems/string-compression
public class StringCompression {

    /**
     * Given an array of characters chars, compress it using the following algorithm:
     * <p>
     * Begin with an empty string s. For each group of consecutive repeating characters in chars:
     * <p>
     * If the group's length is 1, append the character to s.
     * Otherwise, append the character followed by the group's length.
     * <p>
     * The compressed string s should not be returned separately, but instead be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
     * <p>
     * After you are done modifying the input array, return the new length of the array.
     * <p>
     * <p>
     * Follow up:
     * Could you solve it using only O(1) extra space?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: chars = ["a","a","b","b","c","c","c"]
     * Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
     * Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
     * <p>
     * Example 2:
     * <p>
     * Input: chars = ["a"]
     * Output: Return 1, and the first character of the input array should be: ["a"]
     * Explanation: The only group is "a", which remains uncompressed since it's a single character.
     * <p>
     * Example 3:
     * <p>
     * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
     * Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
     * Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
     * <p>
     * Example 4:
     * <p>
     * Input: chars = ["a","a","a","b","b","a","a"]
     * Output: Return 6, and the first 6 characters of the input array should be: ["a","3","b","2","a","2"].
     * Explanation: The groups are "aaa", "bb", and "aa". This compresses to "a3b2a2". Note that each group is independent even if two groups have the same character.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= chars.length <= 2000
     * chars[i] is a lower-case English letter, upper-case English letter, digit, or symbol.
     *
     * @param chars
     * @return the length of the compressed string
     */


    //Time Complexity = O(N)
    //Space Complexity = O(1)
    public int compress(char[] chars) {

        int i = 0;
        int index = 0;
        while (i < chars.length) {
            int j = i;
            while (j < chars.length) {
                if (chars[i] != chars[j]) {
                    break;
                }
                j++;
            }
            chars[index++] = chars[i];
            if (j - i > 1) {
                String count = String.valueOf(j - i);
                for (char c : count.toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }
        return index;
    }
}
