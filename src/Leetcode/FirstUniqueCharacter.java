package Leetcode;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/first-unique-character-in-a-string
public class FirstUniqueCharacter {

    /**
     * Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
     * <p>
     * Examples:
     * <p>
     * s = "leetcode"
     * return 0.
     * <p>
     * s = "loveleetcode"
     * return 2.
     * <p>
     * <p>
     * Note: You may assume the string contains only lowercase English letters.
     *
     * @param s
     * @return the index of the first unique char
     */

    //Time Complexity = O(N), where N is the length of the string
    //Space Complexity = O(N), where N is the length of the string
    public int firstUniqueChar(String s) {

        //store the characters in order
        Map<Character, Integer> map = new LinkedHashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //check if repeated, then remove from the map
            if (set.contains(c)) {
                map.remove(c);
            } else {
                set.add(c);
                map.put(c, i);
            }
        }

        //the map will have all the non repeated chars in order. Return the first one
        return map.size() == 0 ? -1 : map.entrySet().iterator().next().getValue();
    }
}
