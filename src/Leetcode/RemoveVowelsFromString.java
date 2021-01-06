package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/remove-vowels-from-a-string
public class RemoveVowelsFromString {

    /**
     * Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: "leetcodeisacommunityforcoders"
     * Output: "ltcdscmmntyfrcdrs"
     * Example 2:
     * <p>
     * Input: "aeiou"
     * Output: ""
     */

    //Time Complexity = O(N), where N is the length of S
    //Space Complexity = O(N), where N is the length of S
    public String removeVowels(String S) {

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char[] arr = S.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                continue;
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
