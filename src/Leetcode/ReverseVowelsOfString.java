package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/reverse-vowels-of-a-string
public class ReverseVowelsOfString {

    /**
     * Write a function that takes a string as input and reverse only the vowels of a string.
     * <p>
     * Example 1:
     * <p>
     * Input: "hello"
     * Output: "holle"
     * <p>
     * Example 2:
     * <p>
     * Input: "leetcode"
     * Output: "leotcede"
     * <p>
     * Note:
     * The vowels does not include the letter "y".
     *
     * @param s
     * @return string which reverses only the vowels of a string.
     */

    //Time Complexity = O(N), where N is the length of the String
    //Space Complexity = O(1)
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;

        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        while (low < high) {
            if (!set.contains(arr[low])) {
                low++;
                continue;
            }
            if (!set.contains(arr[high])) {
                high--;
                continue;
            }
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        return String.valueOf(arr);
    }
}
