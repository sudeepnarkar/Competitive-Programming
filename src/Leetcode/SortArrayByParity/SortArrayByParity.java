package Leetcode.SortArrayByParity;


/**
 * @author : Sudeep Narkar
 * @since : 10/24/2020, Sat, 9:38 PM
 **/

//https://leetcode.com/problems/sort-array-by-parity/
public class SortArrayByParity {


    /**
     * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
     * <p>
     * You may return any answer array that satisfies this condition.
     * <p>
     * Example 1:
     * <p>
     * Input: [3,1,2,4]
     * Output: [2,4,3,1]
     * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     */


    public int[] sortArrayByParity(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int temp = A[i];
                A[i] = A[index];
                A[index++] = temp;
            }
        }
        return A;
    }
}
