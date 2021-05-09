package Leetcode;

//https://leetcode.com/problems/second-largest-digit-in-a-string
public class SecondLargestDigitInAString {

    /**
     * Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
     * <p>
     * An alphanumeric string is a string consisting of lowercase English letters and digits.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "dfa12321afd"
     * Output: 2
     * Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
     * Example 2:
     * <p>
     * Input: s = "abc1111"
     * Output: -1
     * Explanation: The digits that appear in s are [1]. There is no second largest digit.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 500
     * s consists of only lowercase English letters and/or digits.
     *
     * @param s
     * @return
     */

    //Time Complexity = O(N), where N is the length of the S
    // Space Complexity = O(1)
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }
        }
        return second;
    }
}
