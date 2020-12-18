package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
    // Space Complexity = O(1)
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        if (p == null || s == null || p.length() == 0 || s.length() == 0 || p.length() > s.length()) {
            return list;
        }

        int sLen = s.length();
        int pLen = p.length();
        //maintain the frequency count
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        for (char c : p.toCharArray()) {
            pArr[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (i >= pLen) {
                sArr[s.charAt(i - pLen) - 'a']--;
            }
            sArr[s.charAt(i) - 'a']++;
            if (Arrays.equals(sArr, pArr)) {
                list.add(i - pLen + 1);
            }
        }
        return list;
    }
}
