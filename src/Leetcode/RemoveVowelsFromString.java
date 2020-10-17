package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveVowelsFromString {

    /**
     * Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
     *
     *
     *
     * Example 1:
     *
     * Input: "leetcodeisacommunityforcoders"
     * Output: "ltcdscmmntyfrcdrs"
     * Example 2:
     *
     * Input: "aeiou"
     * Output: ""
     */
    public String removeVowels(String S) {

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        char [] arr = S.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(set.contains(arr[i])){
                continue;
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

}
