package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/3/2021, Sun, 4:07 PM
 **/

//https://leetcode.com/problems/monotonic-array
public class MonotonicArray {

    /**
     * An array is monotonic if it is either monotone increasing or monotone decreasing.
     * <p>
     * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
     * <p>
     * Return true if and only if the given array A is monotonic.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: [1,2,2,3]
     * Output: true
     * Example 2:
     * <p>
     * Input: [6,5,4,4]
     * Output: true
     * Example 3:
     * <p>
     * Input: [1,3,2]
     * Output: false
     * Example 4:
     * <p>
     * Input: [1,2,4,5]
     * Output: true
     * Example 5:
     * <p>
     * Input: [1,1,1]
     * Output: true
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= A.length <= 50000
     * -100000 <= A[i] <= 100000
     *
     * @param A
     * @return
     */

    //Time Complexity = O(N)
    //Space Complexity = O(1)
    public boolean isMonotonic(int[] A) {

        int compare = 0;
        int equals = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                equals++;
            } else if (A[i] < A[i + 1]) {
                compare++;
            } else if (A[i] > A[i + 1]) {
                compare--;
            }
        }
        int len = A.length;
        return len - 1 == Math.abs(compare) || len - 1 == Math.abs(compare) + equals;
    }

    //Time Complexity = O(N)
    //Space Complexity = O(1)
    public boolean isMonotonicUsingBoolean(int[] A) {

        boolean inc = false;
        boolean dec = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                inc = true;
            } else if (A[i] > A[i + 1]) {
                dec = true;
            }
        }
        return inc && dec ? false : true;
    }
}
