package Leetcode;

import java.util.HashSet;

/**
 * @author : Sudeep Narkar
 * @since : 12/29/20, Tue, 10:30 PM
 **/

//https://leetcode.com/problems/count-the-number-of-consistent-strings
public class CountTheNumberOfConsistentStrings {


    /**
     * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
     * <p>
     * Return the number of consistent strings in the array words.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
     * Output: 2
     * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
     * Example 2:
     * <p>
     * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
     * Output: 7
     * Explanation: All strings are consistent.
     * Example 3:
     * <p>
     * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
     * Output: 4
     * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= words.length <= 104
     * 1 <= allowed.length <= 26
     * 1 <= words[i].length <= 10
     * The characters in allowed are distinct.
     * words[i] and allowed contain only lowercase English letters.
     *
     * @param allowed
     * @param words
     * @return the number of consistent strings in the array words.
     */

    //Time Complexity = O(N*M), where N is the length of words array and M is the average length of each word
    //Space Complexity = O (L), where L is the length of String allowed which is the space required for the Set
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int count = 0;
        for (String word : words) {
            boolean allow = true;
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    break;
                }
            }
            if (allow) {
                count++;
            }
        }
        return count;
    }
}
