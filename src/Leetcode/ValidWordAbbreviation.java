package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/16/2020, Wed, 4:49 PM
 **/

//https://leetcode.com/problems/valid-word-abbreviation
public class ValidWordAbbreviation {

    /**
     * Given a non-empty string s and an abbreviation abbr, return whether the string matches with the given abbreviation.
     * <p>
     * A string such as "word" contains only the following valid abbreviations:
     * <p>
     * ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
     * Notice that only the above abbreviations are valid abbreviations of the string "word". Any other string is not a valid abbreviation of "word".
     * <p>
     * Note:
     * Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.
     * <p>
     * Example 1:
     * Given s = "internationalization", abbr = "i12iz4n":
     * <p>
     * Return true.
     * Example 2:
     * Given s = "apple", abbr = "a2e":
     * <p>
     * Return false.
     *
     * @param word
     * @param abbr
     * @return true if the string matches with the given abbreviation or return false
     */
    
    //Time Complexity = O(N) where N is the length of the word. In worst case the word and the abbr are the same.
    //Space Complexity = O(1)
    public boolean validWordAbbreviation(String word, String abbr) {

        int wordIndex = 0;
        int abbrIndex = 0;
        while (wordIndex < word.length() && abbrIndex < abbr.length()) {

            if (word.charAt(wordIndex) == abbr.charAt(abbrIndex)) {
                wordIndex++;
                abbrIndex++;
                continue;
            }
            if (!Character.isDigit(abbr.charAt(abbrIndex)) || abbr.charAt(abbrIndex) == '0') {
                return false;
            }
            int start = abbrIndex;
            while (abbrIndex < abbr.length() && Character.isDigit(abbr.charAt(abbrIndex))) {
                abbrIndex++;
            }
            int offset = Integer.parseInt(abbr.substring(start, abbrIndex));
            wordIndex += offset;
        }
        return wordIndex == word.length() && abbrIndex == abbr.length();
    }
}
