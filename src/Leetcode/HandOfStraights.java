package Leetcode;

import java.util.TreeMap;

/**
 * @author : Sudeep Narkar
 * @since : 4/1/21, Thu, 9:03 AM
 **/

//https://leetcode.com/problems/hand-of-straights
public class HandOfStraights {

    /**
     * Alice has a hand of cards, given as an array of integers.
     * <p>
     * Now she wants to rearrange the cards into groups so that each group is size W, and consists of W consecutive cards.
     * <p>
     * Return true if and only if she can.
     * <p>
     * Note: This question is the same as 1296: https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
     * Output: true
     * Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
     * Example 2:
     * <p>
     * Input: hand = [1,2,3,4,5], W = 4
     * Output: false
     * Explanation: Alice's hand can't be rearranged into groups of 4.
     *
     * @param hand
     * @param W
     * @return true if and only if the cards can be rearranged in the group or return false
     */

    //Time Complexity = O(N), where N is the length of hand array
    //Space Complexity = O(N), where N is the length of hand array
    public boolean isNStraightHand(int[] hand, int W) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        //populate the frequency map
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        // As long as the map has elements, check whether a hand of size W can be formed.
        while (map.size() > 0) {
            int firstCard = map.firstKey();
            for (int card = firstCard; card < firstCard + W; card++) {
                if (!map.containsKey(card)) {
                    return false;
                }
                int count = map.get(card);
                if (count > 1) {
                    map.put(card, --count);
                } else if (count == 1) {
                    map.remove(card);
                }
            }
        }
        return true;
    }
}
