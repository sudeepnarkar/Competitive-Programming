package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/13/21, Sat, 8:24 PM
 **/

//https://leetcode.com/problems/flip-game-ii
public class FlipGameII {

    /**
     * You are playing a Flip Game with your friend.
     * <p>
     * You are given a string currentState that contains only '+' and '-'. You and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move, and therefore the other person will be the winner.
     * <p>
     * Return true if the starting player can guarantee a win, and false otherwise.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: currentState = "++++"
     * Output: true
     * Explanation: The starting player can guarantee a win by flipping the middle "++" to become "+--+".
     * Example 2:
     * <p>
     * Input: currentState = "+"
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= currentState.length <= 60
     * currentState[i] is either '+' or '-'.
     *
     * @param s
     * @return
     */

    //Time Complexity = (O(N!!)), where N is the length of the String S
    //Space Complexity = (O(N!!)), considering recursion stack, where N is the length of the String S
    public boolean canWin(String s) {

        //backtracking solution
        //If String is null or the length of string is less than 2, the player cannot flip so return false
        if (s == null || s.length() < 2) {
            return false;
        }
        int len = s.length();
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
                String nextMove = s.substring(0, i - 1) + "--" + s.substring(i + 1);
                //Backtracking.. check if the next player cannot win, then I win
                if (!canWin(nextMove)) {
                    return true;
                }
            }
        }
        return false;
    }
}
