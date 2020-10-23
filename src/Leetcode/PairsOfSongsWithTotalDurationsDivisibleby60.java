package Leetcode;

import java.util.HashMap;

/**
 * @author : Sudeep Narkar
 * @since : 10/23/2020, Fri, 5:02 PM
 **/

//https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
public class PairsOfSongsWithTotalDurationsDivisibleby60 {


    /***
     *
     * In a list of songs, the i-th song has a duration of time[i] seconds.
     *
     * Return the number of pairs of songs for which their total duration in seconds is divisible by 60.  Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.
     *
     * Example 1:
     *
     * Input: [30,20,150,100,40]
     * Output: 3
     * Explanation: Three pairs have a total duration divisible by 60:
     * (time[0] = 30, time[2] = 150): total duration 180
     * (time[1] = 20, time[3] = 100): total duration 120
     * (time[1] = 20, time[4] = 40): total duration 60
     * Example 2:
     *
     * Input: [60,60,60]
     * Output: 3
     * Explanation: All three pairs have a total duration of 120, which is divisible by 60.
     *
     */


    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0;
        for (int t : time) {
            int reducedTime = t % 60;
            int other = (reducedTime == 0) ? 0 : 60 - reducedTime;
            // check if compliment is present. If present add value
            res += count.getOrDefault(other, 0);
            count.put(reducedTime, count.getOrDefault(reducedTime, 0) + 1);
        }
        return res;
    }

}