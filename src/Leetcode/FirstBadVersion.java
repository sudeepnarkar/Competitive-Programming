package Leetcode;

import java.util.Arrays;

/**
 * @author : Sudeep Narkar
 * @since : 12/13/2020, Sun, 1:24 PM
 **/

//https://leetcode.com/problems/first-bad-version
public class FirstBadVersion {

    /**
     * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
     * <p>
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
     * <p>
     * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 5, bad = 4
     * Output: 4
     * Explanation:
     * call isBadVersion(3) -> false
     * call isBadVersion(5) -> true
     * call isBadVersion(4) -> true
     * Then 4 is the first bad version.
     * Example 2:
     * <p>
     * Input: n = 1, bad = 1
     * Output: 1
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= bad <= n <= 231 - 1
     *
     * @param n
     * @return
     */

    // Time Complexity = O (logn)
    // Space Complexity = O (1)
    public static int firstBadVersion(int n) {

        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean isBadVersion(int n) {
        return booleanArr[n - 1];
    }

    static boolean[] booleanArr = new boolean[5];

    public static void main(String[] args) {
        Arrays.fill(booleanArr, Boolean.FALSE);
        booleanArr[3] = true;
        booleanArr[4] = true;
        System.out.println(firstBadVersion(5));

    }
}
