package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/5/2021, Fri, 9:06 PM
 **/

//https://leetcode.com/problems/counting-bits
public class CountingBits {

    /**
     * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
     * <p>
     * Example 1:
     * <p>
     * Input: 2
     * Output: [0,1,1]
     * <p>
     * Example 2:
     * <p>
     * Input: 5
     * Output: [0,1,1,2,1,2]
     * <p>
     * Follow up:
     * <p>
     * It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
     * Space complexity should be O(n).
     * Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
     *
     * @param num
     * @return the binary representation of the count of number of ones in the range 0 ≤ i ≤ num in form of array
     */

    //Time Complexity = O(n*sizeof(integer))
    //Space Complexity = O(1)
    //TODO optimize the solution to O(N)
    public int[] countBits(int num) {

        int[] arr = new int[num + 1];
        int count = 0;
        int index = 0;
        for (int i = 0; i <= num; i++) {
            count = 0;
            int n = i;
            while (n > 0) {
                count += n & 1;
                n >>= 1;
            }
            arr[index] = count;
            index++;
        }
        return arr;
    }
}
