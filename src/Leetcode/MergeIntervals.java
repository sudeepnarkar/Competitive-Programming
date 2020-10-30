package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 10/30/2020, Fri, 1:26 PM
 **/

//https://leetcode.com/problems/merge-intervals
public class MergeIntervals {

    /**
     * Given a collection of intervals, merge all overlapping intervals.
     * <p>
     * Example 1:
     * <p>
     * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
     * Example 2:
     * <p>
     * Input: intervals = [[1,4],[4,5]]
     * Output: [[1,5]]
     * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
     */

    public int[][] merge(int[][] intervals) {

        if (intervals.length == 0) {
            return intervals;
        }

        Arrays.sort(intervals, (n1, n2) -> n1[0] - n2[0]);
        List<int[]> list = new ArrayList<>();

        int[] prevInterval = intervals[0];
        list.add(prevInterval);

        for (int[] interval : intervals) {

            if (interval[0] <= prevInterval[1]) {
                prevInterval[1] = Math.max(interval[1], prevInterval[1]);
            } else {
                prevInterval = interval;
                list.add(prevInterval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
