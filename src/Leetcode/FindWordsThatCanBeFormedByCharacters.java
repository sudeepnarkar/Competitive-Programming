package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/9/2021, Sat, 8:46 PM
 **/

//https://leetcode.com/problems/find-words-that-can-be-formed-by-characters
public class FindWordsThatCanBeFormedByCharacters {


    /**
     * You are given an array of strings words and a string chars.
     * <p>
     * A string is good if it can be formed by characters from chars (each character can only be used once).
     * <p>
     * Return the sum of lengths of all good strings in words.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: words = ["cat","bt","hat","tree"], chars = "atach"
     * Output: 6
     * Explanation:
     * The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
     * <p>
     * Example 2:
     * <p>
     * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
     * Output: 10
     * Explanation:
     * The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
     * <p>
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= words.length <= 1000
     * 1 <= words[i].length, chars.length <= 100
     * All strings contain lowercase English letters only.
     *
     * @param words
     * @param chars
     * @return sum of lengths of all good strings in words
     */

    //Time Complexity = O(N), where N is the length of words
    //Space Complexity = O(1)
    public int countCharacters(String[] words, String chars) {

        int[] arr = new int[26];
        for (char c : chars.toCharArray()) {
            arr[c - 'a']++;
        }
        int count = 0;
        for (String str : words) {
            int[] cpy = arr.clone();
            boolean found = true;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (cpy[c - 'a'] < 1) {
                    found = false;
                    break;
                } else {
                    cpy[c - 'a']--;
                }
            }
            if (found) {
                count += str.length();
            }
        }
        return count;
    }
}
