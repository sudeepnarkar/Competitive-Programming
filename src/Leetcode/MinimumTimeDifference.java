package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 2/15/2021, Mon, 12:13 PM
 **/

//https://leetcode.com/problems/minimum-time-difference/
public class MinimumTimeDifference {

    /**
     * Given a list of 24-hour clock time points in "HH:MM" format, return the minimum minutes difference between any two time-points in the list.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: timePoints = ["23:59","00:00"]
     * Output: 1
     * <p>
     * Example 2:
     * <p>
     * Input: timePoints = ["00:00","23:59","00:00"]
     * Output: 0
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= timePoints <= 2 * 104
     * timePoints[i] is in the format "HH:MM".
     *
     * @param timePoints
     * @return the minimum minutes difference between any two time-points in the list.
     */

    //Time Complexity = O(NLogN), where N is the length of timePoint list
    //Space Complexity = O(N), where N is the length of timePoint list
    public int findMinDifference(List<String> timePoints) {

        List<Integer> times = new ArrayList<>();
        int mm = Integer.MAX_VALUE;

        //convert the time in mins and store in the list
        for (int i = 0; i < timePoints.size(); i++) {
            int hour = Integer.parseInt(timePoints.get(i).substring(0, 2));
            int mins = Integer.parseInt(timePoints.get(i).substring(3, 5));
            times.add(60 * hour + mins);
        }

        //sort list in ascending
        Collections.sort(times);
        for (int i = 1; i < times.size(); i++) {
            mm = Math.min(mm, times.get(i) - times.get(i - 1));
        }

        int size = times.size();

        //calculate wrapAround time difference on sorted list
        int wrapAroundDiff = times.get(0) + ((24 * 60) - times.get(size - 1));

        return Math.min(mm, wrapAroundDiff);
    }
}
