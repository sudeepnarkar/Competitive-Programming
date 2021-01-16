package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 10/27/2020, Tue, 8:55 PM
 **/

//https://leetcode.com/problems/top-k-frequent-words/
public class TopKFrequentWords {

    /**
     * Given a non-empty list of words, return the k most frequent elements.
     * <p>
     * Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.
     * <p>
     * Example 1:
     * Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
     * Output: ["i", "love"]
     * Explanation: "i" and "love" are the two most frequent words.
     * Note that "i" comes before "love" due to a lower alphabetical order.
     * Example 2:
     * Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
     * Output: ["the", "is", "sunny", "day"]
     * Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
     * with the number of occurrence being 4, 3, 2 and 1 respectively.
     */

    //Time Complexity = O(NlogN), where N is the length of words
    //Space Complexity = O(N), where N is the length of words
    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();
        List<String> resList = new ArrayList<>();

        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        // create a max heap of words based on map entries sorted by values and maintain lexicographical order
        PriorityQueue<String> maxHeap = new PriorityQueue<>((word1, word2) -> map.get(word1).equals(map.get(word2)) ?
                word1.compareTo(word2) :
                map.get(word2) - map.get(word1));

        for (String n : map.keySet()) {
            maxHeap.add(n);
        }

        while (k > 0) {
            String str1 = maxHeap.poll();
            resList.add(str1);
            k--;
        }
        return resList;
    }
}
