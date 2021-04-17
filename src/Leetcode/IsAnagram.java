package Leetcode;

//https://leetcode.com/problems/valid-anagram
public class IsAnagram {


    /**
     * Given two strings s and t , write a function to determine if t is an anagram of s.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * <p>
     * Example 2:
     * <p>
     * Input: s = "rat", t = "car"
     * Output: false
     * <p>
     * Note:
     * You may assume the string contains only lowercase alphabets.
     *
     * @param s
     * @param t
     * @return if t is an anagram of s.
     */


    //Time Complexity = O(N), where N is the length of S
    //Space Complexity = O(1)
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] chars = new int[26];

        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            chars[c - 'a']--;
            if (chars[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
