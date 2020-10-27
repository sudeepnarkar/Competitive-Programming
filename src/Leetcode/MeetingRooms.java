package Leetcode;

import java.util.Arrays;

/**
 * @author : Sudeep Narkar
 * @since : 10/27/2020, Tue, 9:52 AM
 **/

//https://leetcode.com/problems/meeting-rooms/
public class MeetingRooms {

    /**
     * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
     * <p>
     * Example 1:
     * <p>
     * Input: [[0,30],[5,10],[15,20]]
     * Output: false
     * Example 2:
     * <p>
     * Input: [[7,10],[2,4]]
     * Output: true
     */

    public boolean canAttendMeetings(int[][] intervals) {

        Arrays.sort(intervals, (int[] o1, int[] o2) -> o1[0] - o2[0]);

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }
        return true;
    }
}