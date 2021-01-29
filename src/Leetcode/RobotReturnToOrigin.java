package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/29/2021, Fri, 8:18 AM
 **/

//https://leetcode.com/problems/robot-return-to-origin
public class RobotReturnToOrigin {

    /**
     * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
     * <p>
     * The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.
     * <p>
     * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: moves = "UD"
     * Output: true
     * Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
     * <p>
     * Example 2:
     * <p>
     * Input: moves = "LL"
     * Output: false
     * Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.
     * <p>
     * Example 3:
     * <p>
     * Input: moves = "RRDD"
     * Output: false
     * <p>
     * Example 4:
     * <p>
     * Input: moves = "LDRRLRUULR"
     * Output: false
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= moves.length <= 2 * 104
     * moves only contains the characters 'U', 'D', 'L' and 'R'.
     *
     * @param moves
     * @return true if the robot can return to the origin, or return false
     */

    //Time Complexity = O(N), where N is the length of moves String
    //Space Complexity = O(1)
    public boolean judgeCircle(String moves) {

        int countLeft = 0;
        int countRight = 0;
        int countUp = 0;
        int countDown = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                countLeft++;
            } else if (c == 'R') {
                countRight++;
            } else if (c == 'U') {
                countUp++;
            } else {
                countDown++;
            }
        }
        return countLeft == countRight && countUp == countDown;
    }
}
