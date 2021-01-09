package Leetcode;

//https://leetcode.com/problems/valid-palindrome
public class ValidPalindrome {
    /**
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     * <p>
     * Note: For the purpose of this problem, we define empty string as valid palindrome.
     * <p>
     * Example 1:
     * <p>
     * Input: "A man, a plan, a canal: Panama"
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input: "race a car"
     * Output: false
     */

    //Time Complexity = O(N), where N is the length of S
    //Space Complexity = O(1)
    public boolean isPalindrome(String s) {

        if (s.equals("")) {
            return true;
        }

        s = s.toLowerCase();

        int low = 0;
        int high = s.length() - 1;
        char[] arr = s.toCharArray();
        while (low < high) {
            if (!isValidChar(arr[low])) {
                low++;
                continue;
            }
            if (!isValidChar(arr[high])) {
                high--;
                continue;
            }
            if (arr[low] != arr[high]) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public boolean isValidChar(Character c) {
        if (Character.isDigit(c) || Character.isAlphabetic(c)) {
            return true;
        }
        return false;
    }
}
