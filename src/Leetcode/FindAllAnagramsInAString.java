package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 12/18/2020, Fri, 1:56 PM
 **/

//https://leetcode.com/problems/find-all-anagrams-in-a-string
public class FindAllAnagramsInAString {

    /**
     * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
     * <p>
     * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
     * <p>
     * The order of output does not matter.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * s: "cbaebabacd" p: "abc"
     * <p>
     * Output:
     * [0, 6]
     * <p>
     * Explanation:
     * The substring with start index = 0 is "cba", which is an anagram of "abc".
     * The substring with start index = 6 is "bac", which is an anagram of "abc".
     * Example 2:
     * <p>
     * Input:
     * s: "abab" p: "ab"
     * <p>
     * Output:
     * [0, 1, 2]
     * <p>
     * Explanation:
     * The substring with start index = 0 is "ab", which is an anagram of "ab".
     * The substring with start index = 1 is "ba", which is an anagram of "ab".
     * The substring with start index = 2 is "ab", which is an anagram of "ab".
     *
     * @param s
     * @param p
     * @return
     */

    // Time Complexity = O(N) where N is the length of the String S
    // Space Complexity = O(N) here N is the length of the String S
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        // Create Character Frequency Map for s
        HashMap<Character, Integer> charsToFillMap = new HashMap<>();
        for (char pChar : p.toCharArray()) {
            charsToFillMap.put(pChar, charsToFillMap.getOrDefault(pChar, 0) + 1);
        }
        int counter = charsToFillMap.size();
        int left = 0;
        int right = 0;

        // Two pointer approach
        while (right < s.length()) {
            char sChar = s.charAt(right);
            if (charsToFillMap.containsKey(sChar)) {
                charsToFillMap.put(sChar, charsToFillMap.get(sChar) - 1);
                if (charsToFillMap.get(sChar) == 0) {
                    counter--;
                }
            }
            right++;
            // All chars required for permutation are covered if counter =0
            while (counter == 0) {
                sChar = s.charAt(left);
                if (charsToFillMap.containsKey(sChar)) {
                    charsToFillMap.put(sChar, charsToFillMap.get(sChar) + 1);
                    if (charsToFillMap.get(sChar) > 0) {
                        counter++;
                    }
                }
                // check if the permutation exists, if yes add start index
                if ((right - left) == p.length()) {
                    list.add(left);
                }
                left++;
            }
        }
        return list;
    }
}
