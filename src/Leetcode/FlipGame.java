package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 3/13/21, Sat, 6:39 PM
 **/

//https://leetcode.com/problems/flip-game
public class FlipGame {

    /**
     * You are playing a Flip Game with your friend.
     * <p>
     * You are given a string currentState that contains only '+' and '-'. You and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move, and therefore the other person will be the winner.
     * <p>
     * Return all possible states of the string currentState after one valid move. You may return the answer in any order. If there is no valid move, return an empty list [].
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: currentState = "++++"
     * Output: ["--++","+--+","++--"]
     * Example 2:
     * <p>
     * Input: currentState = "+"
     * Output: []
     *
     * @param s
     * @return all possible states of the string currentState after one valid move
     */

    //Time Complexity = O(N), where N is the length of String s
    //Space Complexity = O(N), where N is the length of String s
    public List<String> generatePossibleNextMoves(String s) {

        List<String> list = new ArrayList<>();
        int len = s.length();
        for (int i = 1; i < len; i++) {
            //check if two consecutive chars are '+', then replace them with '-' and add in the list
            if (s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
                String str = s.substring(0, i - 1) + "--" + s.substring(i + 1, len);
                list.add(str);
            }
        }
        return list;
    }
}
