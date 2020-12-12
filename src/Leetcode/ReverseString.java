package Leetcode;

//https://leetcode.com/problems/reverse-string
public class ReverseString {

    /**
     * Write a function that reverses a string. The input string is given as an array of characters char[].
     * <p>
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * <p>
     * You may assume all the characters consist of printable ascii characters.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     * <p>
     * Example 2:
     * <p>
     * Input: ["H","a","n","n","a","h"]
     * Output: ["h","a","n","n","a","H"]
     *
     * @param s
     */

    // Time Complexity = O(n) 
    //Space Complexity = O(1)
    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
