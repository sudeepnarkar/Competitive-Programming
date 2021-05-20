package Leetcode;

import java.util.Map;
import java.util.TreeMap;

//https://leetcode.com/problems/sorting-the-sentence
public class SortingTheSentence {

    /**
     * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
     * <p>
     * A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
     * <p>
     * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
     * <p>
     * Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "is2 sentence4 This1 a3"
     * Output: "This is a sentence"
     * Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
     * <p>
     * Example 2:
     * <p>
     * Input: s = "Myself2 Me1 I4 and3"
     * Output: "Me Myself and I"
     * Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= s.length <= 200
     * s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
     * The number of words in s is between 1 and 9.
     * The words in s are separated by a single space.
     * s contains no leading or trailing spaces.
     *
     * @param s
     * @return
     */

    //Time Complexity = O(N), where N is the length of S
    //Space Complexity = O(N), where N is the length of S
    public String sortSentence(String s) {

        Map<Integer, String> map = new TreeMap<>();
        String[] strArr = s.split(" ");
        for (String str : strArr) {
            int len = str.length();
            int n = Character.getNumericValue(str.charAt(len - 1));
            map.put(n, str);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            String str = e.getValue();
            sb.append(str.substring(0, str.length() - 1));
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
