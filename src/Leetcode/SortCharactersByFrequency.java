package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 2/9/2021, Tue, 10:22 PM
 **/

//https://leetcode.com/problems/sort-characters-by-frequency
public class SortCharactersByFrequency {

    /**
     * Given a string, sort it in decreasing order based on the frequency of characters.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * "tree"
     * <p>
     * Output:
     * "eert"
     * <p>
     * Explanation:
     * 'e' appears twice while 'r' and 't' both appear once.
     * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
     * <p>
     * Example 2:
     * <p>
     * Input:
     * "cccaaa"
     * <p>
     * Output:
     * "cccaaa"
     * <p>
     * Explanation:
     * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
     * Note that "cacaca" is incorrect, as the same characters must be together.
     * <p>
     * Example 3:
     * <p>
     * Input:
     * "Aabb"
     * <p>
     * Output:
     * "bbAa"
     * <p>
     * Explanation:
     * "bbaA" is also a valid answer, but "Aabb" is incorrect.
     * Note that 'A' and 'a' are treated as two different characters.
     *
     * @param s
     * @return sorted string in decreasing order based on the frequency of characters.
     */

    //Time Complexity = O(NLogN), where N is the length of string
    //Space Complexity = O(N), where N is the length of string
    public String frequencySort(String s) {

        if (s == null || s.equals("")) {
            return s;
        }

        //char frequency map
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //Heap with map entries sorted by value in descending order
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((n1, n2) -> n2.getValue() - n1.getValue());
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry entry = pq.poll();
            //add character according to their frequencies
            for (int i = 0; i < (int) entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
