package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/25/2020, Sun, 2:46 PM
 **/

//https://leetcode.com/problems/detect-capital/
public class DetectCapital {

    /**
     * Given a word, you need to judge whether the usage of capitals in it is right or not.
     * <p>
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     * <p>
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     * Otherwise, we define that this word doesn't use capitals in a right way.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: "USA"
     * Output: True
     * <p>
     * <p>
     * Example 2:
     * <p>
     * Input: "FlaG"
     * Output: False
     */


    public boolean detectCapitalUse(String word) {
        int caps = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                caps++;
            }
        }
        if (caps == 0 || word.length() == caps) {
            return true;
        }
        return caps == 1 && Character.isUpperCase(word.charAt(0));
    }
}