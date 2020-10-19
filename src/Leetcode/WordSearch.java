package Leetcode;

//https://leetcode.com/problems/word-search/
class WordSearch {

    /**
     * Given a 2D board and a word, find if the word exists in the grid.
     * <p>
     * The word can be constructed from letters of sequentially adjacent cells, where "adjacent" cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
     */

    static boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        int nr = board.length;
        int nc = board[0].length;
        int index = 0;
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if ((word.charAt(index) == board[i][j]) && dfs(i, j, nr, nc, board, index, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int i, int j, int nr, int nc, char[][] board, int index, String word) {

        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= nr || j >= nc || board[i][j] != word.charAt(index) || visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        if (dfs(i + 1, j, nr, nc, board, index + 1, word) ||
                dfs(i - 1, j, nr, nc, board, index + 1, word)
                || dfs(i, j + 1, nr, nc, board, index + 1, word)
                || dfs(i, j - 1, nr, nc, board, index + 1, word)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}



