package Leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 10/28/2020, Wed, 9:09 AM
 **/

//https://leetcode.com/problems/meeting-rooms-ii/
public class MeetingRooms2 {

    /**
     * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
     * <p>
     * Example 1:
     * <p>
     * Input: [[0, 30],[5, 10],[15, 20]]
     * Output: 2
     * Example 2:
     * <p>
     * Input: [[7,10],[2,4]]
     * Output: 1
     */

    public int minMeetingRooms(int[][] intervals) {

        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (int[] a1, int[] a2) -> a1[0] - a2[0]);

        PriorityQueue<int[]> pq = new PriorityQueue(intervals.length, (a, b) -> ((int[]) a)[1] - ((int[]) b)[1]);
        for (int[] interval : intervals) {
            // These two meeting can happen in the same room. So poll the that ends earlier
            if (!pq.isEmpty() && pq.peek()[1] <= interval[0]) {
                pq.poll();
            }
            pq.add(interval);
        }
        return pq.size();
    }
}