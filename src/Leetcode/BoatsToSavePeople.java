package Leetcode;

import java.util.Arrays;

/**
 * @author : Sudeep Narkar
 * @since : 2/27/21, Sat, 8:43 PM
 **/

//https://leetcode.com/problems/boats-to-save-people
public class BoatsToSavePeople {

    /**
     * You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
     * <p>
     * Return the minimum number of boats to carry every given person.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: people = [1,2], limit = 3
     * Output: 1
     * Explanation: 1 boat (1, 2)
     * Example 2:
     * <p>
     * Input: people = [3,2,2,1], limit = 3
     * Output: 3
     * Explanation: 3 boats (1, 2), (2) and (3)
     * Example 3:
     * <p>
     * Input: people = [3,5,3,4], limit = 5
     * Output: 4
     * Explanation: 4 boats (3), (3), (4), (5)
     *
     * @param people
     * @param limit
     * @return the minimum number of boats to carry every given person.
     */

    //Time Complexity = (NlogN), where N is the length of N
    //Space Complexity = (1)
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int minBoats = 0;
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            minBoats++;
        }
        return minBoats;
    }
}
