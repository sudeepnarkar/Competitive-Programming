package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 10/21/2020, Wed, 10:59 PM
 **/

//https://leetcode.com/problems/group-anagrams
public class GroupAnagrams {

    /**
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     * <p>
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     * <p>
     * Example 1:
     * <p>
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * Example 2:
     * <p>
     * Input: strs = [""]
     * Output: [[""]]
     * Example 3:
     * <p>
     * Input: strs = ["a"]
     * Output: [["a"]]
     */

    //Time Complexity = O(N) + O(MLogM), where N is the length of strs and M is the average length of string in strs
    //Space Complexity = O(N), where N is the length of strs
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> groupAnagramsList = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(str);
        }
        groupAnagramsList.addAll(map.values());
        return groupAnagramsList;
    }
}
