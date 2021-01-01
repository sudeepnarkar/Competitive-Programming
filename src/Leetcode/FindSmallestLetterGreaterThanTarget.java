package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/1/2021, Fri, 11:10 AM
 **/

//https://leetcode.com/problems/find-smallest-letter-greater-than-target
public class FindSmallestLetterGreaterThanTarget {


    /**
     * Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.
     * <p>
     * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
     * <p>
     * Examples:
     * Input:
     * letters = ["c", "f", "j"]
     * target = "a"
     * Output: "c"
     * <p>
     * Input:
     * letters = ["c", "f", "j"]
     * target = "c"
     * Output: "f"
     * <p>
     * Input:
     * letters = ["c", "f", "j"]
     * target = "d"
     * Output: "f"
     * <p>
     * Input:
     * letters = ["c", "f", "j"]
     * target = "g"
     * Output: "j"
     * <p>
     * Input:
     * letters = ["c", "f", "j"]
     * target = "j"
     * Output: "c"
     * <p>
     * Input:
     * letters = ["c", "f", "j"]
     * target = "k"
     * Output: "c"
     * Note:
     * letters has a length in range [2, 10000].
     * letters consists of lowercase letters, and contains at least 2 unique letters.
     * target is a lowercase letter.
     *
     * @param letters
     * @param target
     * @return smallest element in the list that is larger than the given target.
     */

    // Time Complexity = O(log N)
    // Space Complexity = O(1)
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // The start is always the char greater than target with wrap around
        return letters[(start) % letters.length];
    }
}
