package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/17/21, Wed, 8:43 AM
 **/

//https://leetcode.com/problems/battleships-in-a-board
public class BattleShipsInABoard {

    /**
     * Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's, empty slots are represented with '.'s. You may assume the following rules:
     * You receive a valid board, made of only battleships or empty slots.
     * Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
     * At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
     * Example:
     * X..X
     * ...X
     * ...X
     * In the above board there are 2 battleships.
     * Invalid Example:
     * ...X
     * XXXX
     * ...X
     * This is an invalid board that you will not receive - as battleships will always have a cell separating between them.
     * Follow up:
     * Could you do it in one-pass, using only O(1) extra memory and without modifying the value of the board?
     *
     * @param board
     * @return number of battle ships
     */

    //Time Complexity = O(N*M), where N and M is the rowLen and colLen
    //Time Complexity = O(1)
    public int countBattleships(char[][] board) {

        int rowLen = board.length;
        int colLen = board[0].length;
        int battleShips = 0;

        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                //still counting vertical battleship
                if (r > 0 && board[r - 1][c] == 'X') {
                    continue;
                }
                //still counting horizontal battleship
                if (c > 0 && board[r][c - 1] == 'X') {
                    continue;
                }
                battleShips++;
            }
        }
        return battleShips;
    }
}
