package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/31/20, Thu, 6:20 PM
 **/

//https://leetcode.com/problems/number-of-segments-in-a-string
public class NumberOfSegmentsInAString {

    /**
     * You are given a string s, return the number of segments in the string.
     * <p>
     * A segment is defined to be a contiguous sequence of non-space characters.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "Hello, my name is John"
     * Output: 5
     * Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
     * Example 2:
     * <p>
     * Input: s = "Hello"
     * Output: 1
     * Example 3:
     * <p>
     * Input: s = "love live! mu'sic forever"
     * Output: 4
     * Example 4:
     * <p>
     * Input: s = ""
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= s.length <= 300
     * s consists of lower-case and upper-case English letters, digits or one of the following characters "!@#$%^&*()_+-=',.:".
     * The only space character in s is ' '.
     *
     * @param s
     * @return the number of segments in the string.
     */

    //Time Complexity = O(N), where N is the length of the String s
    //Space Complexity = O(1)
    public int countSegments(String s) {

        String str = s.trim();
        if (str.equals("")) {
            return 0;
        }
        return str.trim().split("\\s+").length;
    }
}
