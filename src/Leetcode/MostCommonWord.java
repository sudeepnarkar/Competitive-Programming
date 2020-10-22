package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 10/22/2020, Thu, 8:49 AM
 **/

//https://leetcode.com/problems/most-common-word
public class MostCommonWord {

    /**
     * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
     * <p>
     * Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.
     * <p>
     * <p>
     * <p>
     * Example:
     * <p>
     * Input:
     * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
     * banned = ["hit"]
     * Output: "ball"
     * Explanation:
     * "hit" occurs 3 times, but it is a banned word.
     * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
     * Note that words in the paragraph are not case sensitive,
     * that punctuation is ignored (even if adjacent to words, such as "ball,"),
     * and that "hit" isn't the answer e
     */

    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedWords = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        for (String str : banned) {
            bannedWords.add(str);
        }

        String[] strArr = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split("\\s+");

        for (String str : strArr) {
            if (!bannedWords.contains(str)) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }
        String res = " ";
        for (String key : map.keySet()) {
            if (res.equals(" ") || map.get(key) > map.get(res)) {
                res = key;
            }
        }
        return res;
    }
}