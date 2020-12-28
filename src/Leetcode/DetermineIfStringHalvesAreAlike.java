package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author : Sudeep Narkar
 * @since : 12/27/2020, Sun, 7:10 PM
 **/

//https://leetcode.com/problems/determine-if-string-halves-are-alike
public class DetermineIfStringHalvesAreAlike {

    /**
     * You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
     * <p>
     * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
     * <p>
     * Return true if a and b are alike. Otherwise, return false.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "book"
     * Output: true
     * Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
     * Example 2:
     * <p>
     * Input: s = "textbook"
     * Output: false
     * Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
     * Notice that the vowel o is counted twice.
     * Example 3:
     * <p>
     * Input: s = "MerryChristmas"
     * Output: false
     * Example 4:
     * <p>
     * Input: s = "AbCdEfGh"
     * Output: true
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= s.length <= 1000
     * s.length is even.
     * s consists of uppercase and lowercase letters.
     *
     * @param s
     * @return true if a and b are alike. Otherwise, return false.
     */

    // Time Complexity = O(N),where N is the length of N
    // Time Complexity = O(1), the space complexity for a set to store vowels is constant.
    public boolean halvesAreAlike(String s) {

        int len = s.length();
        int leftCount = 0;
        int rightCount = 0;
        int i, j;
        i = 0;
        j = len - 1;
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        while (i < j) {
            if (set.contains(arr[i])) {
                leftCount++;
            }
            if (set.contains(arr[j])) {
                rightCount++;
            }
            i++;
            j--;
        }
        return leftCount == rightCount;
    }
}
