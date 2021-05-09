package Leetcode;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram
public class CheckIfTheSentenceIsPangram {

    /**
     * A pangram is a sentence where every letter of the English alphabet appears at least once.
     * <p>
     * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
     * Output: true
     * Explanation: sentence contains at least one of every letter of the English alphabet.
     * Example 2:
     * <p>
     * Input: sentence = "leetcode"
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= sentence.length <= 1000
     * sentence consists of lowercase English letters.
     *
     * @param sentence
     * @return
     */

    //Time Complexity = O(N), where N is the length of sentence
    //Space Complexity = O(1)
    public boolean checkIfPangram(String sentence) {

        int[] arr = new int[26];
        int total = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (++arr[c - 'a'] == 1) {
                total++;
            }
        }
        return total == 26;
    }
}
