package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/1/2021, Mon, 7:18 PM
 **/

//https://leetcode.com/problems/count-primes/
public class CountPrimes {

    /**
     * Count the number of prime numbers less than a non-negative number, n.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 10
     * Output: 4
     * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     * <p>
     * Example 2:
     * <p>
     * Input: n = 0
     * Output: 0
     * <p>
     * Example 3:
     * <p>
     * Input: n = 1
     * Output: 0
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= n <= 5 * 106
     *
     * @param n
     * @return Count the number of prime numbers less than a non-negative number, n.
     */

    //Time Complexity  = O(N)
    //Space Complexity  = O(N)
    public int countPrimes(int n) {

        int count = 0;
        if (n < 2) {
            return count;
        }

        //Sieve of Eratosthenes
        boolean[] arr = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (arr[i] == false) {
                count++;
                //make all the multiples of i as true in order to neglect counting them
                for (int j = 2; i * j < n; j++) {
                    arr[i * j] = true;
                }
            }
        }
        return count;
    }
}
}
