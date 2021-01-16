package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 1/16/2021, Sat, 6:03 PM
 **/

//https://leetcode.com/problems/letter-combinations-of-a-phone-number
public class LetterCombinationsOfAPhoneNumber {

    /**
     * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
     * <p>
     * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: digits = "23"
     * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     * <p>
     * Example 2:
     * <p>
     * Input: digits = ""
     * Output: []
     * <p>
     * Example 3:
     * <p>
     * Input: digits = "2"
     * Output: ["a","b","c"]
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= digits.length <= 4
     * digits[i] is a digit in the range ['2', '9'].
     *
     * @param digits
     * @return all possible letter combinations that the number could represent.
     */

    //Time Complexity = O(3^N), where N is the length of digits
    //Space Complexity = O(3^N), where N is the length of digits
    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        if (digits.length() == 0) {
            return res;
        }

        String[] mappings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res.add("");
        for (char c : digits.toCharArray()) {
            //ASCII subtraction to get the index in mappings array
            res = combineDigits(mappings[c - '0'], res);
        }
        return res;
    }

    public List<String> combineDigits(String str, List<String> res) {

        ArrayList<String> result = new ArrayList<>();
        for (char c : str.toCharArray()) {
            for (String s : res) {
                result.add(s + c);
            }
        }
        return result;
    }
}
