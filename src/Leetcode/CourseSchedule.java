package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 11/15/2020, Sun, 5:49 PM
 **/

//https://leetcode.com/problems/course-schedule/
public class CourseSchedule {

    /**
     * There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.
     * <p>
     * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
     * <p>
     * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: numCourses = 2, prerequisites = [[1,0]]
     * Output: true
     * Explanation: There are a total of 2 courses to take.
     * To take course 1 you should have finished course 0. So it is possible.
     * <p>
     * Example 2:
     * <p>
     * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
     * Output: false
     * Explanation: There are a total of 2 courses to take.
     * To take course 1 you should have finished course 0, and to take course 0 you should
     * also have finished course 1. So it is impossible.
     *
     * @param numCourses
     * @param prerequisites
     * @return true if the all courses can be finished or return false
     */

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> adjListMap = new HashMap<>();
        int[] indegree = new int[numCourses];

        // Build adjListMap and indegree array
        for (int[] pre : prerequisites) {
            List<Integer> list = adjListMap.getOrDefault(pre[1], new ArrayList<Integer>());
            list.add(pre[0]);
            adjListMap.put(pre[1], list);
            indegree[pre[0]]++;
        }

        // Build queue. Insert nodes that have indegree zero
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            if (!adjListMap.containsKey(course)) {
                continue;
            }
            List<Integer> childList = adjListMap.get(course);

            /**
             * Explore child nodes and decrement their indegree by one.
             * Check if for any node if the indegree is zero, if yes add
             * it to the queue.
             */

            for (int i = 0; i < childList.size(); i++) {
                int child = childList.get(i);
                indegree[child]--;
                if (indegree[child] == 0) {
                    queue.offer(child);
                }
            }
        }
        return count == numCourses;
    }
}
