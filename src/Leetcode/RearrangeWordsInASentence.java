package Leetcode;

import java.util.Arrays;

/**
 * @author : Sudeep Narkar
 * @since : 3/5/2021, Fri, 12:01 PM
 **/


//https://leetcode.com/problems/rearrange-words-in-a-sentence
public class RearrangeWordsInASentence {

    /**
     * Given a sentence text (A sentence is a string of space-separated words) in the following format:
     * <p>
     * First letter is in upper case.
     * Each word in text are separated by a single space.
     * <p>
     * Your task is to rearrange the words in text such that all words are rearranged in an increasing order of their lengths. If two words have the same length, arrange them in their original order.
     * <p>
     * Return the new text following the format shown above.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: text = "Leetcode is cool"
     * Output: "Is cool leetcode"
     * Explanation: There are 3 words, "Leetcode" of length 8, "is" of length 2 and "cool" of length 4.
     * Output is ordered by length and the new first word starts with capital letter.
     * <p>
     * Example 2:
     * <p>
     * Input: text = "Keep calm and code on"
     * Output: "On and keep calm code"
     * Explanation: Output is ordered as follows:
     * "On" 2 letters.
     * "and" 3 letters.
     * "keep" 4 letters in case of tie order by position in original text.
     * "calm" 4 letters.
     * "code" 4 letters.
     * <p>
     * Example 3:
     * <p>
     * Input: text = "To be or not to be"
     * Output: "To be or to be not"
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * text begins with a capital letter and then contains lowercase letters and single space between words.
     * 1 <= text.length <= 10^5
     *
     * @param text
     * @return
     */

    //Time Complexity = O(N), where N is the length of text
    //Space Complexity = O(N), where N is the length of text
    public String arrangeWords(String text) {

        //Split the text on " "
        String[] arr = text.toLowerCase().split(" ");
        //sort the array based on ascending order of string lengths
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        //create a result string
        String res = String.join(" ", arr);
        //convert the first chat to upper case and return
        res = Character.toUpperCase(res.charAt(0)) + res.substring(1);
        return res;
    }
}
