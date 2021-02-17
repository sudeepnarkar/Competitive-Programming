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

    //Time Complexity = O(N), where N is the length of prerequisites
    //Space Complexity = O(N), where N is the length of prerequisites
    public int[] findOrder(int numCourses, int[][] prerequisites) {


        // HashMap will have key as the pre - req course and the value (list) as the dependent courses
        HashMap<Integer, List<Integer>> adjMap = new HashMap<>();
        // In degree of a course will represent the number of pre-req for that course
        int[] indegree = new int[numCourses];
        for (int[] pre : prerequisites) {
            List<Integer> list = adjMap.get(pre[1]);
            if (list == null) {
                list = new ArrayList<Integer>();
            }
            list.add(pre[0]);
            adjMap.put(pre[1], list);
            indegree[pre[0]]++;
        }

        //Add courses whose in degree is zero as they are the one with no pre-reqs and can be taken
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int[] res = new int[numCourses];

        //count to represent the number of courses that can be taken
        int count = 0;
        while (!q.isEmpty()) {

            int course = q.remove();
            res[count++] = course;

            List<Integer> childrenList = adjMap.get(course);

            if (childrenList == null) {
                continue;
            }

            /**
             * Explore child course nodes and decrement their indegree by one because the prereq is explored.
             * Check if for any course node if the indegree is zero, if yes add
             * it to the queue because that course can be taken
             */

            for (int i = 0; i < childrenList.size(); i++) {
                int childCourse = childrenList.get(i);
                indegree[childCourse]--;
                if (indegree[childCourse] == 0) {
                    q.offer(childCourse);
                }
            }
        }

        /**
         * check if the count is equal to numcourses to check whether all courses can be taken.
         * If yes, return the order of the courses else return an empty array if cyclic dependency exists
         */
        return count == numCourses ? res : new int[]{};
    }
}
