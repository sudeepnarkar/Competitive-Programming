package Leetcode;

public class IsAnangram {


    /*Given two strings s and t , write a function to determine if t is an anagram of s.

    Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true
    Example 2:

    Input: s = "rat", t = "car"
    Output: false

    */

    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()){
            return false;
        }

        int [] chars = new int[26];

        for(char c:s.toCharArray()){
            chars[c-'a']++;
        }

        for(char c:t.toCharArray()){
            chars[c-'a']--;
            if (chars[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}
