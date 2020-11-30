package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/29/2020, Sun, 10:01 PM
 **/

//https://leetcode.com/problems/shortest-word-distance/
public class ShortestWordDistance {


    /**
     * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
     * <p>
     * Example:
     * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
     * <p>
     * Input: word1 = “coding”, word2 = “practice”
     * Output: 3
     * <p>
     * Input: word1 = "makes", word2 = "coding"
     * Output: 1
     *
     * @param words
     * @param word1
     * @param word2
     * @return shortest distance
     */

    // Time complexity = O(N)
    // Space complexity = O(1)
    public int shortestDistance(String[] words, String word1, String word2) {

        int index1 = -1;
        int index2 = -1;

        int shortestDistance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(word1)) {
                index1 = i;
            }
            if (words[i].equals(word2)) {
                index2 = i;
            }
            int diff = Math.abs(index1 - index2);
            if (index1 !=-1 && index2 !=-1 && diff < shortestDistance) {
                shortestDistance = diff;
            }
        }
        return shortestDistance;
    }
}
