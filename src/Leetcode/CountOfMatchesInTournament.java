package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/18/2021, Mon, 6:34 AM
 **/

//https://leetcode.com/problems/count-of-matches-in-tournament
public class CountOfMatchesInTournament {

    /**
     * You are given an integer n, the number of teams in a tournament that has strange rules:
     * <p>
     * If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
     * If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
     * <p>
     * Return the number of matches played in the tournament until a winner is decided.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 7
     * Output: 6
     * Explanation: Details of the tournament:
     * - 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
     * - 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
     * - 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
     * Total number of matches = 3 + 2 + 1 = 6.
     * <p>
     * Example 2:
     * <p>
     * Input: n = 14
     * Output: 13
     * Explanation: Details of the tournament:
     * - 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
     * - 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
     * - 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
     * - 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
     * Total number of matches = 7 + 3 + 2 + 1 = 13.
     *
     * @param n
     * @return the number of matches played in the tournament until a winner is decided.
     */

    //Time Complexity = O(LogN)
    //Space Complexity = O(1)
    public int numberOfMatches(int n) {

        int matches = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                matches += n;
            } else {
                n = (n - 1) / 2;
                matches += n;
                n++;
            }
        }
        return matches;
    }
}
