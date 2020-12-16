package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/15/2020, Tue, 7:16 PM
 **/

//https://leetcode.com/problems/palindrome-permutation
public class PalindromePermutation {

    /**
     * Given a string, determine if a permutation of the string could form a palindrome.
     * <p>
     * Example 1:
     * <p>
     * Input: "code"
     * Output: false
     * Example 2:
     * <p>
     * Input: "aab"
     * Output: true
     * Example 3:
     * <p>
     * Input: "carerac"
     * Output: true
     *
     * @param s
     * @return true if permutation of the string could form a palindrome or return false;
     */

    // Time Complexity = O(N) where N is the length of the string s
    // Space Complexity = O(1) as the arr used a constant size of 128
    public boolean canPermutePalindrome(String s) {

        int[] arr = new int[128];
        for (char c : s.toCharArray()) {
            arr[c]++;
        }
        int oddOccuranceCount = 0;
        for (int n : arr) {
            if (n % 2 == 1) {
                oddOccuranceCount++;
            }
            if (oddOccuranceCount > 1) {
                return false;
            }
        }
        return true;
    }
}
