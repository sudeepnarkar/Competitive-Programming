package Leetcode;

public class ValidPalindromeII {

    /**
     * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
     * <p>
     * Example 1:
     * Input: "aba"
     * Output: True
     * Example 2:
     * Input: "abca"
     * Output: True
     * Explanation: You could delete the character 'c'.
     */

    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        char[] arr = s.toCharArray();
        while (low < high) {
            if (arr[low] != arr[high]) {
                return inPalindrome(arr, low + 1, high) || inPalindrome(arr, low, high - 1);
            }
            low++;
            high--;
        }
        return true;
    }

    public boolean inPalindrome(char[] arr, int low, int high) {

        while (low < high) {
            if (arr[low] != arr[high]) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
