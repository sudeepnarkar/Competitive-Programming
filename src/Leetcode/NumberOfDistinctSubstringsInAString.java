package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 1/3/2021, Sun, 5:04 PM
 **/

//https://leetcode.com/problems/number-of-distinct-substrings-in-a-string
public class NumberOfDistinctSubstringsInAString {

    /**
     * Given a string s, return the number of distinct substrings of s.
     * <p>
     * A substring of a string is obtained by deleting any number of characters (possibly zero) from the front of the string and any number (possibly zero) from the back of the string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "aabbaba"
     * Output: 21
     * Explanation: The set of distinct strings is ["a","b","aa","bb","ab","ba","aab","abb","bab","bba","aba","aabb","abba","bbab","baba","aabba","abbab","bbaba","aabbab","abbaba","aabbaba"]
     * Example 2:
     * <p>
     * Input: s = "abcdefg"
     * Output: 28
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 500
     * s consists of lowercase English letters.
     *
     * @param s
     * @return
     */

    // Time Complexity = O(N^2), where N is the length of the String
    // Space Complexity = O(N*(N+1)/2), where N is the length of the String
    public int countDistinct(String s) {

        Set<String> set = new HashSet<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < arr.length; j++) {
                sb.append(arr[j]);
                set.add(sb.toString());
            }
        }
        return set.size();
    }

    class Trie {
        Trie[] children = new Trie[26];
    }

    Trie root = new Trie();

    // Time Complexity = O(N^2), where N is the length of the String
    // Space Complexity = O(N), where N is the length of the String using a Trie
    public int countDistinctUsingTrie(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Trie curr = root;
            for (int j = i; j < s.length(); j++) {
                int ch = s.charAt(j);
                if (curr.children[ch - 'a'] == null) {
                    curr.children[ch - 'a'] = new Trie();
                    count++;
                }
                curr = curr.children[ch - 'a'];
            }
        }
        return count;
    }
}
