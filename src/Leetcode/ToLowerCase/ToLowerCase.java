package Leetcode.ToLowerCase;

/**
 * @author : Sudeep Narkar
 * @version : 11/10/2020, Tue, 07:08 AM
 **/


//https://leetcode.com/problems/to-lower-case/
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
     * <p>
     * Example 2:
     * <p>
     * Input: "here"
     * Output: "here"
     * <p>
     * Example 3:
     * <p>
     * Input: "LOVELY"
     * Output: "lovely"
     */

    public static String toLowerCase(String str) {

        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int ch = (int) (str.charAt(i));
            if (ch <= 90 && ch >= 65) {
                arr[i] = (char) (ch + 32);
            } else {
                arr[i] = (char) ch;
            }
        }
        return String.valueOf(arr);
    }
}
