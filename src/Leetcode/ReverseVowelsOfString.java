package Leetcode;

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
     * @param a
     * @return string which reverses only the vowels of a string.
     */

    //Time Complexity = O(N), where N is the length of the String
    //Space Complexity = O(1)
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (!isVowel(arr[i])) {
                i++;
                continue;
            }
            if (!isVowel(arr[j])) {
                j--;
                continue;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }

    public static boolean isVowel(char a) {
        switch (a) {
            case ('a'):
                return true;
            case ('e'):
                return true;
            case ('i'):
                return true;
            case ('o'):
                return true;
            case ('u'):
                return true;
            case ('A'):
                return true;
            case ('E'):
                return true;
            case ('I'):
                return true;
            case ('O'):
                return true;
            case ('U'):
                return true;
            default:
                return false;
        }
    }
}
