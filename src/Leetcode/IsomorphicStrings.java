package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 10/29/2020, Thu, 4:08 PM
 **/

//https://leetcode.com/problems/isomorphic-strings
public class IsomorphicStrings {


    /**
     * Given two strings s and t, determine if they are isomorphic.
     * <p>
     * Two strings are isomorphic if the characters in s can be replaced to get t.
     * <p>
     * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "egg", t = "add"
     * Output: true
     * Example 2:
     * <p>
     * Input: s = "foo", t = "bar"
     * Output: false
     * Example 3:
     * <p>
     * Input: s = "paper", t = "title"
     * Output: true
     */

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        int i = 0;
        while (i < s.length()) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (!map.containsKey(a)) {
                if (map.containsValue(b)) {
                    return false;
                }
                map.put(a, b);
            } else {
                if (b != map.get(a)) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}