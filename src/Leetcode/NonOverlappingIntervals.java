package Leetcode;

import java.util.Arrays;

/**
 * @author : Sudeep Narkar
 * @since : 10/30/2020, Fri, 4:37 PM
 **/

//https://leetcode.com/problems/non-overlapping-intervals
public class NonOverlappingIntervals {

    /**
     * Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
     * <p>
     * Example 1:
     * <p>
     * Input: [[1,2],[2,3],[3,4],[1,3]]
     * Output: 1
     * Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.
     * Example 2:
     * <p>
     * Input: [[1,2],[1,2],[1,2]]
     * Output: 2
     * Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.
     * Example 3:
     * <p>
     * Input: [[1,2],[2,3]]
     * Output: 0
     * Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
     */

    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length == 0 || intervals.length == 1) {
            return 0;
        }

        Arrays.sort(intervals, (n1, n2) -> n1[0] - n2[0]);

        int minIntervalsToRemove = 0;
        int[] prevInterval = null;


        for (int[] interval : intervals) {

            //When found an overlapping interval, remove the one with a larger end time
            if (prevInterval != null && interval[0] < prevInterval[1]) {
                prevInterval[1] = Math.min(prevInterval[1], interval[1]);
                minIntervalsToRemove++;
            } else {
                prevInterval = interval;
            }
        }

        return minIntervalsToRemove;
    }
}
