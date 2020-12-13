package Leetcode;

import java.util.HashMap;

/**
 * @author : Sudeep Narkar
 * @since : 12/13/2020, Sun, 4:55 PM
 **/

//https://leetcode.com/problems/verifying-an-alien-dictionary
public class VerifyingAnAlienDictionary {

    /**
     * In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
     * <p>
     * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
     * Output: true
     * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
     * Example 2:
     * <p>
     * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
     * Output: false
     * Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
     * Example 3:
     * <p>
     * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
     * Output: false
     * Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= words.length <= 100
     * 1 <= words[i].length <= 20
     * order.length == 26
     * All characters in words[i] and order are English lowercase letters.
     *
     * @param words
     * @param order
     * @return
     */


    // Time Complexity = O(NS) where N = number of words, S = average length of a word
    // Space Complexity = O(1)
    public boolean isAlienSorted(String[] words, String order) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            map.put(ch, i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int index = 0;
            while (index < word1.length() && index < word2.length()) {

                // if chars are same, check furthur characters
                if (word1.charAt(index) == word2.charAt(index)) {
                    index++;
                }
                // if chars are not in lexicographical order, return false
                else if (map.get(word1.charAt(index)) > map.get(word2.charAt(index))) {
                    return false;
                }
                // Check next words in the words array
                else {
                    break;
                }
            }
            if (index < word1.length() && index >= word2.length()) {
                return false;
            }
        }
        return true;
    }
}
