package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 12/26/20, Sat, 7:04 PM
 **/

//https://leetcode.com/problems/friend-circles/
public class FriendCircles {

    /**
     * There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we defined a friend circle is a group of students who are direct or indirect friends.
     * <p>
     * Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * [[1,1,0],
     * [1,1,0],
     * [0,0,1]]
     * Output: 2
     * Explanation:The 0th and 1st students are direct friends, so they are in a friend circle.
     * The 2nd student himself is in a friend circle. So return 2.
     * <p>
     * <p>
     * Example 2:
     * <p>
     * Input:
     * [[1,1,0],
     * [1,1,1],
     * [0,1,1]]
     * Output: 1
     * Explanation:The 0th and 1st students are direct friends, the 1st and 2nd students are direct friends,
     * so the 0th and 2nd students are indirect friends. All of them are in the same friend circle, so return 1.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= N <= 200
     * M[i][i] == 1
     * M[i][j] == M[j][i]
     *
     * @param M
     * @return total number of friend circles among all the students
     */
    // Time Complexity = O(N^2), as all elements in the matrix are visited once
    // Space Complexity = O(N), as a boolean visited array of size N is used
    public int findCircleNumDFS(int[][] M) {

        int n = M.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            dfs(i, M, visited);
            count++;
        }
        return count;
    }

    public void dfs(int i, int[][] M, boolean[] visited) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == false) {
                visited[j] = true;
                dfs(j, M, visited);
            }
        }
    }

    // Time Complexity = O(N^2), as all elements in the matrix are visited once
    // Space Complexity = O(N), as a boolean visited array of size N is used
    public int findCircleNumBFS(int[][] M) {

        boolean[] visited = new boolean[M.length];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i]) {
                continue;
            }
            q.offer(i);
            while (!q.isEmpty()) {
                int el = q.remove();
                visited[el] = true;
                for (int j = 0; j < M.length; j++) {
                    if (M[el][j] == 1 && !visited[j]) {
                        q.offer(j);
                    }
                }
            }
            count++;
        }
        return count;
    }
}
