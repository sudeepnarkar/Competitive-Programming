package Leetcode;

import java.sql.Time;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 1/31/21, Sun, 1:46 PM
 **/

//https://leetcode.com/problems/keys-and-rooms
public class KeysAndRooms {

    /**
     * There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room.
     * <p>
     * Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.
     * <p>
     * Initially, all the rooms start locked (except for room 0).
     * <p>
     * You can walk back and forth between rooms freely.
     * <p>
     * Return true if and only if you can enter every room.
     * <p>
     * Example 1:
     * <p>
     * Input: [[1],[2],[3],[]]
     * Output: true
     * Explanation:
     * We start in room 0, and pick up key 1.
     * We then go to room 1, and pick up key 2.
     * We then go to room 2, and pick up key 3.
     * We then go to room 3.  Since we were able to go to every room, we return true.
     * Example 2:
     * <p>
     * Input: [[1,3],[3,0,1],[2],[0]]
     * Output: false
     * Explanation: We can't enter the room with number 2.
     * Note:
     * <p>
     * 1 <= rooms.length <= 1000
     * 0 <= rooms[i].length <= 1000
     * The number of keys in all rooms combined is at most 3000.
     *
     * @param rooms
     * @return
     */

    //Time Complexity =  O(N + E), where N is the number of rooms, and E is the total number of keys.
    //Space Complexity = O(N), where N is the total number of rooms
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        if (rooms == null || rooms.size() == 0) {
            return false;
        }

        //Visited set to keep track of visited rooms
        //Stack is used to do DFS of graph
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.push(0);
        visited.add(0);
        while (!st.isEmpty()) {
            List<Integer> keys = rooms.get(st.pop());
            for (int key : keys) {
                if (!visited.contains(key)) {
                    visited.add(key);
                    st.push(key);
                }
            }
        }
        return visited.size() == rooms.size();
    }
}
