package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author : Sudeep Narkar
 * @since : 12/20/2020, Sun, 9:21 AM
 **/

//https://leetcode.com/problems/goat-latin
public class GoatLatin {

    /**
     * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
     * <p>
     * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
     * <p>
     * The rules of Goat Latin are as follows:
     * <p>
     * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
     * For example, the word 'apple' becomes 'applema'.
     * <p>
     * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
     * For example, the word "goat" becomes "oatgma".
     * <p>
     * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
     * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
     * Return the final sentence representing the conversion from S to Goat Latin.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: "I speak Goat Latin"
     * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
     * Example 2:
     * <p>
     * Input: "The quick brown fox jumped over the lazy dog"
     * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
     * <p>
     * <p>
     * Notes:
     * <p>
     * S contains only uppercase, lowercase and spaces. Exactly one space between each word.
     * 1 <= S.length <= 150.
     *
     * @param S
     * @return the sentennce in "Goat Latin" (a made-up language similar to Pig Latin.)
     */

    // Time Complexity = O(N) where N is the length of words in S
    // Space Complexity = O(N), technically O(N+N) for splitting the S and storing result
    public String toGoatLatin(String S) {

        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        String[] arr = S.split("\\s+");
        String[] res = new String[arr.length];
        int index = 1;
        for (String str : arr) {
            StringBuilder sb = new StringBuilder();
            char ch = str.charAt(0);
            if (set.contains(ch)) {
                sb.append(str);
            } else {
                sb.append(str.substring(1));
                sb.append(ch);
            }
            sb.append("ma");
            for (int i = 0; i < index; i++) {
                sb.append("a");
            }
            res[index - 1] = sb.toString();
            index++;
        }
        String finalString = String.join(" ", res);
        return finalString;
    }
}
