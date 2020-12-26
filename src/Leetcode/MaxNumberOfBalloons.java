package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/26/20, Sat, 11:30 AM
 **/
//https://leetcode.com/problems/maximum-number-of-balloons
public class MaxNumberOfBalloons {

    /**
     * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
     * <p>
     * You can use each character in text at most once. Return the maximum number of instances that can be formed.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * <p>
     * Input: text = "nlaebolko"
     * Output: 1
     * Example 2:
     * <p>
     * <p>
     * <p>
     * Input: text = "loonbalxballpoon"
     * Output: 2
     * Example 3:
     * <p>
     * Input: text = "leetcode"
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= text.length <= 10^4
     * text consists of lower case English letters only.
     *
     * @param text
     * @return Return the maximum number of balloon instances that can be formed.
     */


    // Time Complexity = O(N)
    // Time Complexity = O(1)
    public int maxNumberOfBalloons(String text) {

        int b, a, l, o, n;
        b = a = l = o = n = 0;

        for (char c : text.toCharArray()) {

            if (c == 'b') {
                b++;
            } else if (c == 'a') {
                a++;
            } else if (c == 'l') {
                l++;
            } else if (c == 'o') {
                o++;
            } else if (c == 'n') {
                n++;
            }
        }

        int count = 0;
        // Get the limiting factor for every character.
        // Limiting factor for a, b and n is 1.
        count = Math.min(a, Math.min(a, b));
        count = Math.min(count, n);
        // Limiting factor for l, o is 2.
        count = Math.min(count, l / 2);
        count = Math.min(count, o / 2);

        return count;
    }
}
