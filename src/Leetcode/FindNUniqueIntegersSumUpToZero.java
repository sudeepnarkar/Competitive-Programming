package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 10/18/2020, Sun, 8:07 PM
 **/

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero
public class FindNUniqueIntegersSumUpToZero {


    /**
     * Given an integer n, return any array containing n unique integers such that they add up to 0.
     * <p>
     * Example 1:
     * <p>
     * Input: n = 5
     * Output: [-7,-1,1,3,4]
     * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
     * Example 2:
     * <p>
     * Input: n = 3
     * Output: [-1,0,1]
     * Example 3:
     * <p>
     * Input: n = 1
     * Output: [0]
     */

    int[] res;

    public int[] sumZero(int n) {
        res = new int[n];
        boolean isEven = true;
        if ((n % 2) == 0) {
            return sumZeroUtil(n, isEven);
        } else {
            isEven = false;
            return sumZeroUtil(n, isEven);
        }
    }

    public int[] sumZeroUtil(int n, boolean isEven) {
        int index = 0;
        if (isEven) {
            for (int i = -(n / 2); i <= (n / 2); i++) {
                if (i == 0) {
                    continue;
                }
                res[index++] = i;
            }
        } else {
            for (int i = -(n / 2); i <= (n / 2); i++) {
                res[index++] = i;
            }
        }
        return res;
    }
}