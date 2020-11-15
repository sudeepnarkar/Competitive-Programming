package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 11/15/2020, Sun, 6:20 PM
 **/

//https://leetcode.com/problems/course-schedule-ii/
public class CourseScheduleII {


    /**
     * There are a total of n courses you have to take labelled from 0 to n - 1.
     * <p>
     * Some courses may have prerequisites, for example, if prerequisites[i] = [ai, bi] this means you must take the course bi before the course ai.
     * <p>
     * Given the total number of courses numCourses and a list of the prerequisite pairs, return the ordering of courses you should take to finish all courses.
     * <p>
     * If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: numCourses = 2, prerequisites = [[1,0]]
     * Output: [0,1]
     * Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1].
     * <p>
     * Example 2:
     * <p>
     * Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
     * Output: [0,2,1,3]
     * Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
     * So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].
     * <p>
     * Example 3:
     * <p>
     * Input: numCourses = 1, prerequisites = []
     * Output: [0]
     *
     * @param numCourses
     * @param prerequisites
     * @return array with the topological order of courses or an empty array if a cyclic dependency exist
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        HashMap<Integer, List<Integer>> adjListMap = new HashMap<>();
        int[] indegree = new int[numCourses];

        // Build queue and indegree array
        for (int[] preArr : prerequisites) {
            List<Integer> list = adjListMap.getOrDefault(preArr[1], new ArrayList<Integer>());
            list.add(preArr[0]);
            adjListMap.put(preArr[1], list);
            indegree[preArr[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        // insert courses in queue with zero indegree (prerequisites)
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int index = 0;
        int[] order = new int[numCourses];
        int count = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            order[index++] = course;
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
                if (--indegree[child] == 0) {
                    queue.offer(child);
                }
            }
        }
        // return the order if all courses can be finished or an empty array if a cyclic dependency exist
        return count == numCourses ? order : new int[0];
    }
}
