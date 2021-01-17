package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 1/17/2021, Sun, 3:04 PM
 **/

//https://leetcode.com/problems/string-matching-in-an-array
public class StringMatchingInAnArray {


    /**
     * Given an array of string words. Return all strings in words which is substring of another word in any order.
     * <p>
     * String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: words = ["mass","as","hero","superhero"]
     * Output: ["as","hero"]
     * Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
     * ["hero","as"] is also a valid answer.
     * <p>
     * Example 2:
     * <p>
     * Input: words = ["leetcode","et","code"]
     * Output: ["et","code"]
     * Explanation: "et", "code" are substring of "leetcode".
     * <p>
     * Example 3:
     * <p>
     * Input: words = ["blue","green","bu"]
     * Output: []
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= words.length <= 100
     * 1 <= words[i].length <= 30
     * words[i] contains only lowercase English letters.
     * It's guaranteed that words[i] will be unique.
     *
     * @param words
     * @return all strings in words which is substring of another word in any order.
     */

    //Time Complexity = O(N^2), where N is the words length, and S is the max length of a word
    //Space Complexity = O(1)
    public List<String> stringMatching(String[] words) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            String currWord = words[i];
            for (int j = i + 1; j < words.length; j++) {
                String nextWord = words[j];
                if (currWord.contains(nextWord)) {
                    if (!list.contains(nextWord))
                        list.add(nextWord);
                }
                if (nextWord.contains(currWord)) {
                    if (!list.contains(currWord))
                        list.add(currWord);
                }
            }
        }
        return list;
    }
}
