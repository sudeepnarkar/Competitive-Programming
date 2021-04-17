package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 4/14/21, Wed, 7:05 PM
 **/

//https://leetcode.com/problems/to-lower-case
public class ToLowerCase {

    /**
     * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: "Hello"
     * Output: "hello"
     * Example 2:
     * <p>
     * Input: "here"
     * Output: "here"
     * Example 3:
     * <p>
     * Input: "LOVELY"
     * Output: "lovely"
     *
     * @param str
     * @return
     */

    //Time Complexity = O(N), where N is the length of str
    //Space Complexity = O(N), where N is the length of str
    public String toLowerCase(String str) {

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                c = (char) (c + 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
