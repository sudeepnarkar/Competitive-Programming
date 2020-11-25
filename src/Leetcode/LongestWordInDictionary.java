package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 11/25/2020, Wed, 8:08 AM
 **/

//https://leetcode.com/problems/longest-word-in-dictionary
public class LongestWordInDictionary {


    /**
     * Given a list of strings words representing an English Dictionary, find the longest word in words that can be built one character at a time by other words in words. If there is more than one possible answer, return the longest word with the smallest lexicographical order.
     * If there is no answer, return the empty string.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * words = ["w","wo","wor","worl", "world"]
     * Output: "world"
     * Explanation:
     * The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
     * <p>
     * Example 2:
     * <p>
     * Input:
     * words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
     * Output: "apple"
     * Explanation:
     * Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
     *
     * @param words
     * @return Longest Word in Dictionary
     */

    // Time complexity = O (N), NLogN for sorting and N for traversing the array, i.e NLogN + N = N
    // Space complexity = O(N), storing N strings in the HashSet in worst case
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> visited = new HashSet<>();
        String res = "";
        for (String word : words) {
            int len = word.length();
            if (len == 1 || visited.contains(word.substring(0, len - 1))) {
                // only assign word to res if the length of word is more than len
                // takes care of the case "apple", "apply"
                res = len > res.length() ? word : res;
                visited.add(word);
            }
        }
        return res;
    }
}
